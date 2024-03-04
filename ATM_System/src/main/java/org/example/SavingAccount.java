package org.example;

public class SavingAccount extends Account{
    private int savingAmount;

    public SavingAccount(int savingAmount) {
        this.savingAmount = savingAmount;
    }

    @Override
    public String checkbalance() {
        return "The total amount for Saving Account: "+savingAmount;
    }
    @Override
    public String deposit(int amount) {
        if(amount<0){
            return "Operation Failed for Saving Account!!";
        }else {
            savingAmount = savingAmount+amount;
            return "Deposit Done Successfully for Saving Account!";
        }
    }

    @Override
    public String withdraw(int amount) {
        if(amount>savingAmount){
            return "Operation Failed for Saving Account!!";
        }else {
            savingAmount = savingAmount-amount;
            return "Withdraw Done Successfully for Saving Account! ";
        }
    }
    @Override
    public String transfer(SalaryAccount salaryAccount, int amount){
        if(amount<savingAmount){
            savingAmount=savingAmount-amount;
            int s= salaryAccount.getSalaryAmount()+amount;
            salaryAccount.setSalaryAmount(s);
            return "Transfer Done Successfully, From Saving To Salary Account";
        }
        else {
            return "Fail";
        }
    }

    @Override
    public String transfer(CreditAccount creditAccount, int amount){
        if(amount<savingAmount){
            savingAmount=savingAmount-amount;
            int s= creditAccount.getCreditAmount()+amount;
            creditAccount.setCreditAmount(s);
            return "Transfer Done Successfully, From Saving To Credit Account";
        }
        else {
            return "Fail";
        }
    }

    public int getSavingAmount() {
        return savingAmount;
    }

    public void setSavingAmount(int savingAmount) {
        this.savingAmount = savingAmount;
    }
}
