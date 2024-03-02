package org.example;


public class SalaryAccount extends Account{
    private static int salaryamount = 0;

    public SalaryAccount() {
    }

    public SalaryAccount(int password, String accountname, int amount) {
        super(password, accountname, amount);
    }

    @Override
    public String CheckBalance() {
        return "The total amount for Salary Account: "+salaryamount;
    }

    @Override
    public String Deposit(int amount) {
        if(amount<0){
            return "Operation Failed for Salary Account!!";
        }else {
        salaryamount = salaryamount+amount;
        return "Deposit Done Successfully for Salary Account! ";
        }
    }

    @Override
    public String Withdraw(int amount) {
        if(amount>salaryamount){
            return "Operation Failed for Salary Account!!";
        }else {
            salaryamount = salaryamount-amount;
            return "Withdraw Done Successfully for Salary Account! ";
        }
    }


    @Override
    public String Transfer(String n, String accountname, int amount) {
        if(amount>salaryamount){
            return "Fail !!";
        }
        else {
            if(accountname.equals("saving")){
                salaryamount = salaryamount - amount;
                  int s = SavingAccount.getSavingamount()+amount;
                  SavingAccount.setSavingamount(s);
              } else if (accountname.equals("credit")) {
                  salaryamount = salaryamount - amount;
                  int s = CreditAccount.getCreditamount()+amount;
                CreditAccount.setCreditamount(s);
              }

            return "Done Successfully";
        }
    }

    public static void setSalaryamount(int salaryamount) {
        SalaryAccount.salaryamount = salaryamount;
    }

    public static int getSalaryamount() {
        return salaryamount;
    }


}
