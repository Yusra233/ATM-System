package org.example;


public class SalaryAccount extends Account {
    private int salaryAmount;


    public SalaryAccount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    @Override
    public String checkbalance() {
        return "The total amount for Salary Account: " + salaryAmount;
    }

    @Override
    public String deposit(int amount) {
        if (amount > 0) {
            salaryAmount = salaryAmount + amount;
            return "Deposit Done Successfully for Salary Account! ";
        } else {
            return "Operation Failed for Salary Account!!";
        }
    }

    @Override
    public String withdraw(int amount) {
        if (amount < salaryAmount) {
            salaryAmount = salaryAmount - amount;
            return "Withdraw Done Successfully for Salary Account! ";
        } else {
            return "Operation Failed for Salary Account!!";
        }
    }

    @Override
    public String transfer(SavingAccount savingAccount, int amount){
        if(amount<salaryAmount){
            salaryAmount=salaryAmount-amount;
            int s= savingAccount.getSavingAmount()+amount;
            savingAccount.setSavingAmount(s);
            return "Transfer Done Successfully, From Salary To Saving Account";
        }
        else {
            return "Fail";
    }
    }

    @Override
    public String transfer(CreditAccount creditAccount, int amount){
        if(amount<salaryAmount){
            salaryAmount=salaryAmount-amount;
            int s= creditAccount.getCreditAmount()+amount;
            creditAccount.setCreditAmount(s);
            return "Transfer Done Successfully, From Salary To Credit Account";
        }
        else {
            return "Fail";
        }
    }

    public int getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
}
