package org.example;

public abstract class Account {
    private int password;
    private String accountname;
    private int amount;


    public Account(){}

    public Account(int password,String accountname,int amount) {
        super();
        this.password = password;
        this.accountname=accountname;
        this.amount=amount;
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

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

   public abstract String CheckBalance();

    public abstract String Deposit(int amount);

    public abstract String Withdraw(int amount);

    public abstract String Transfer(String n, String accountname,int amount);




}
