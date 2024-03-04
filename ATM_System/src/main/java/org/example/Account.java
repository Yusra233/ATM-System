package org.example;

public  class Account {
    private int password;
    private int amount ;

    SavingAccount savingAccount;
    SalaryAccount salaryAccount;
    CreditAccount creditAccount;


    public Account(){}

    public Account(int password,SavingAccount savingAccount,SalaryAccount salaryAccount,CreditAccount creditAccount) {
        this.password = password;
        this.amount=salaryAccount.getAmount()+savingAccount.getAmount()+creditAccount.getCreditAmount();
        this.creditAccount=creditAccount;
        this.salaryAccount=salaryAccount;
        this.savingAccount=savingAccount;

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public  String checkbalance(){
        return null;
    }

    public  String deposit(int amount)
    {
        return null;
    }

    public  String withdraw(int amount){
        return null;
    }

    public  String transfer(SalaryAccount salaryAccount, int amount){
        return null;
    }
    public  String transfer(SavingAccount savingAccount, int amount)
    {
        return null;
    }
    public  String transfer(CreditAccount creditAccount, int amount)
    {
        return null;
    }




}
