package org.example;

public class SavingAccount extends Account{
    private static int savingamount =0;

    public SavingAccount() {
    }

    public SavingAccount(int password, String accountname, int amount) {
        super(password, accountname, amount);
    }

    @Override
    public String CheckBalance() {
        return "The total amount for Saving Account: "+savingamount;
    }
    @Override
    public String Deposit(int amount) {
        if(amount<0){
            return "Operation Failed for Saving Account!!";
        }else {
            savingamount = savingamount+amount;
            return "Deposit Done Successfully for Saving Account!";
        }
    }

    @Override
    public String Withdraw(int amount) {
        if(amount>savingamount){
            return "Operation Failed for Saving Account!!";
        }else {
            savingamount = savingamount-amount;
            return "Withdraw Done Successfully for Saving Account! ";
        }
    }

    @Override
    public String Transfer(String n, String accountname, int amount) {
        if(amount>savingamount){
            return "Fail !!";
        }
        else {
            if(accountname.equals("salary")){
                savingamount = savingamount - amount;
                int s = SalaryAccount.getSalaryamount()+amount;
                SalaryAccount.setSalaryamount(s);
            } else if (accountname.equals("credit")) {
                savingamount = savingamount - amount;
                int s = CreditAccount.getCreditamount()+amount;
                CreditAccount.setCreditamount(s);
            }

            return "Done Successfully";
        }
    }

    public static void setSavingamount(int savingamount) {
        SavingAccount.savingamount = savingamount;
    }

    public static int getSavingamount() {
        return savingamount;
    }
}
