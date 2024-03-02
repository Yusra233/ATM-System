package org.example;

public class CreditAccount extends Account{
    private static int creditamount =0;

    public CreditAccount() {
    }

    public CreditAccount(int password, String accountname, int amount) {
        super(password, accountname, amount);
    }

    @Override
    public String CheckBalance() {
        return "The total amount for Credit Account: "+creditamount;

    }

    @Override
    public String Deposit(int amount) {
        if(amount<0){
            return "Operation Failed for Credit Account!!";
        }else {
            creditamount = creditamount+amount;
            return "Deposit Done Successfully for Credit Account!";
        }
    }

    @Override
    public String Withdraw(int amount) {
        if(amount>creditamount){
            return "Operation Failed for Credit Account!!";
        }else {
            creditamount = creditamount-amount;
            return "Withdraw Done Successfully for Credit Account! ";
        }
    }

    @Override
    public String Transfer(String n, String accountname, int amount) {
        if(amount>creditamount){
            return "Fail !!";
        }
        else {
            if(accountname.equals("saving")){
                creditamount = creditamount - amount;
                int s = SavingAccount.getSavingamount()+amount;
                SavingAccount.setSavingamount(s);
            } else if (accountname.equals("salary")) {
                creditamount= creditamount - amount;
                int s = SalaryAccount.getSalaryamount()+amount;
                SalaryAccount.setSalaryamount(s);
            }

            return "Done Successfully";
        }
    }

    public static void setCreditamount(int creditamount) {
        CreditAccount.creditamount = creditamount;
    }

    public static int getCreditamount() {
        return creditamount;
    }
}
