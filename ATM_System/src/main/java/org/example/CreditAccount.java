package org.example;

public class CreditAccount extends Account {
    private int creditAmount;

    public CreditAccount(int creditAmount) {
        this.creditAmount = creditAmount;
    }

    @Override
    public String checkbalance() {
        return "The total amount for Credit Account: " + creditAmount;

    }

    @Override
    public String deposit(int amount) {
        if (amount < 0) {
            return "Operation Failed for Credit Account!!";
        } else {
            creditAmount = creditAmount + amount;
            return "Deposit Done Successfully for Credit Account!";
        }
    }

    @Override
    public String withdraw(int amount) {
        if (amount > creditAmount) {
            return "Operation Failed for Credit Account!!";
        } else {
            creditAmount = creditAmount - amount;
            return "Withdraw Done Successfully for Credit Account! ";
        }
    }

    @Override
    public String transfer(SalaryAccount salaryAccount, int amount){
        if(amount<creditAmount){
            creditAmount=creditAmount-amount;
            int s= salaryAccount.getSalaryAmount()+amount;
            salaryAccount.setSalaryAmount(s);
            return "Transfer Done Successfully, From Credit To Salary Account";
        }
        else {
            return "Fail";
        }
    }

    @Override
    public String transfer(SavingAccount savingAccount, int amount){
        if(amount<creditAmount){
            creditAmount=creditAmount-amount;
            int s= savingAccount.getSavingAmount()+amount;
            savingAccount.setSavingAmount(s);
            return "Transfer Done Successfully, From Credit To Saving Account";
        }
        else {
            return "Fail";
        }
    }
    public int getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(int creditAmount) {
        this.creditAmount = creditAmount;
    }

}
