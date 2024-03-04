package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SalaryAccount salaryAccount = new SalaryAccount(500);
        SavingAccount savingAccount = new SavingAccount(400);
        CreditAccount creditAccount = new CreditAccount(300);


        Account account1 = new Account(1512, savingAccount, salaryAccount, creditAccount);
        Account account2 = new Account(5599, savingAccount, salaryAccount, creditAccount);
        Account account3 = new Account(7712, savingAccount, salaryAccount, creditAccount);
        List<Account> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);


        String enterPassword = "       ATM SySteM       \n" +
                "--------------------------\n" +
                "Enter your Password: ";

        String Menu2 = "Choose Account:\n1. Salary Account\n2. Saving Account\n3. Credit Account";
        String Menu3 = "Choose Operation:\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Transfer\n5. Exit Account\n6. Exit Atm";


        outer:
        while (true) {

            System.out.println(enterPassword);

            Scanner scanner1 = new Scanner(System.in);
            String password ;

            do{
                password = scanner1.nextLine();
                if (password.length() != 4)
                    System.out.println("Try Again and Enter 4 digits only");
            } while (password.length() != 4);
            for (Account account : accountList) {
                String passwordString = String.valueOf(account.getPassword());

                if (password.equals(passwordString)) {

                        while (true) {
                        System.out.println(Menu2);
                        Scanner myAccount = new Scanner(System.in);
                        String chosenAccount;
                        chosenAccount = myAccount.nextLine();

                        // Salary Account
                        while (true) {
                            if (chosenAccount.equals("1"))   // Salary Account
                            {
                                System.out.println("Salary Account");
                                System.out.println(Menu3);
                                Scanner myOperation = new Scanner(System.in);
                                String operation;
                                operation = myOperation.nextLine();
                                if (operation.equals("1")) // Salary Account , Check Balance Operation
                                {
                                    System.out.println(salaryAccount.checkbalance());
                                } else if (operation.equals("2")) // Salary Account , Deposit Operation
                                {
                                    Scanner amount = new Scanner(System.in);
                                    System.out.println("Enter amount: ");
                                    String amountValue = amount.nextLine();
                                    int amountInInt = Integer.parseInt(amountValue);
                                    System.out.println(salaryAccount.deposit(amountInInt));
                                } else if (operation.equals("3")) // Salary Account , Withdraw Operation
                                {
                                    Scanner amount = new Scanner(System.in);
                                    System.out.println("Enter amount: ");
                                    String amountValue = amount.nextLine();
                                    int amountInInt = Integer.parseInt(amountValue);
                                    System.out.println(salaryAccount.withdraw(amountInInt));
                                } else if (operation.equals("4")) {
                                    System.out.println("Choose Account To Transfer To: \n1. Saving Account\n2. Credit Account");
                                    int choice;
                                    Scanner chosen=new Scanner(System.in);
                                    System.out.println("Enter your choice");
                                    String chosenValue = chosen.nextLine();
                                    choice=Integer.parseInt(chosenValue);

                                    Scanner amount = new Scanner(System.in);
                                    System.out.println("Enter amount: ");
                                    String amountValue = amount.nextLine();
                                    int amountInInt = Integer.parseInt(amountValue);

                            switch (choice){
                                case 1:{
                                    System.out.println(salaryAccount.transfer(savingAccount,amountInInt));
                                    break ;
                                }
                                case 2:{
                                    System.out.println(salaryAccount.transfer(creditAccount,amountInInt));
                                    break ;
                                }
                            }
                                }

                                else if (operation.equals("5"))  // Salary Account , Exit Account
                                {
                                    break;
                                }

                                else if (operation.equals("6")) {
                                    continue outer;
                                }
                            }

                            // Saving Account
                            else if (chosenAccount.equals("2"))   // Saving Account
                            {
                                System.out.println("Saving Account");
                                System.out.println(Menu3);
                                Scanner myOperation = new Scanner(System.in);
                                String operation;
                                operation = myOperation.nextLine();

                                if (operation.equals("1")) // Saving Account , Check Balance Operation
                                {
                                    System.out.println(savingAccount.checkbalance());
                                }

                                else if (operation.equals("2")) // Saving Account , Deposit Operation
                                {
                                    Scanner amount = new Scanner(System.in);
                                    System.out.println("Enter amount: ");
                                    String amountValue = amount.nextLine();
                                    int amountInInt = Integer.parseInt(amountValue);
                                    System.out.println(savingAccount.deposit(amountInInt));
                                }

                                else if (operation.equals("3")) // Saving Account , Withdraw Operation
                                {
                                    Scanner amount = new Scanner(System.in);
                                    System.out.println("Enter amount: ");
                                    String amountValue = amount.nextLine();
                                    int amountInInt = Integer.parseInt(amountValue);
                                    System.out.println(savingAccount.withdraw(amountInInt));
                                }

                                else if (operation.equals("4")) {
                                    System.out.println("Choose Account To Transfer To: \n1. Salary Account\n2. Credit Account");
                                    int choice;
                                    Scanner chosen=new Scanner(System.in);
                                    System.out.println("Enter your choice");
                                    String chosenValue = chosen.nextLine();
                                    choice=Integer.parseInt(chosenValue);

                                    Scanner amount = new Scanner(System.in);
                                    System.out.println("Enter amount: ");
                                    String amountValue = amount.nextLine();
                                    int amountInInt = Integer.parseInt(amountValue);

                                    switch (choice){
                                        case 1:{
                                            System.out.println(savingAccount.transfer(salaryAccount,amountInInt));
                                            break ;
                                        }
                                        case 2:{
                                            System.out.println(savingAccount.transfer(creditAccount,amountInInt));
                                            break ;
                                        }
                                    }
                                }

                                else if (operation.equals("5"))  // Saving Account , Exit Account
                                {
                                    break;
                                }

                                else if (operation.equals("6")) {
                                    continue outer;
                                }

                            }


                            // Credit Account
                            else {
                                System.out.println(Menu3);
                                Scanner myOperation = new Scanner(System.in);
                                String operation;
                                operation = myOperation.nextLine();

                                if (operation.equals("1")) // Credit Account , Check Balance Operation
                                {
                                    System.out.println(creditAccount.checkbalance());
                                } else if (operation.equals("2")) // Credit Account , Deposit Operation
                                {
                                    Scanner amount = new Scanner(System.in);
                                    System.out.println("Enter amount: ");
                                    String amountValue = amount.nextLine();
                                    int amountInInt = Integer.parseInt(amountValue);
                                    System.out.println(creditAccount.deposit(amountInInt));
                                } else if (operation.equals("3")) // Credit Account , Withdraw Operation
                                {
                                    Scanner amount = new Scanner(System.in);
                                    System.out.println("Enter amount: ");
                                    String amountValue = amount.nextLine();
                                    int amountInInt = Integer.parseInt(amountValue);
                                    System.out.println(creditAccount.withdraw(amountInInt));
                                }

                                else if (operation.equals("4")) {
                                    System.out.println("Choose Account To Transfer To: \n1. Salary Account\n2. Saving Account");
                                    int choice;
                                    Scanner chosen=new Scanner(System.in);
                                    System.out.println("Enter your choice");
                                    String chosenValue = chosen.nextLine();
                                    choice=Integer.parseInt(chosenValue);

                                    Scanner amount = new Scanner(System.in);
                                    System.out.println("Enter amount: ");
                                    String amountValue = amount.nextLine();
                                    int amountInInt = Integer.parseInt(amountValue);

                                    switch (choice){
                                        case 1:{
                                            System.out.println(creditAccount.transfer(salaryAccount,amountInInt));
                                            break ;
                                        }
                                        case 2:{
                                            System.out.println(creditAccount.transfer(savingAccount,amountInInt));
                                            break ;
                                        }
                                    }
                                }

                                else if (operation.equals("5"))  // Credit Account , Exit Account
                                {
                                    break;
                                }

                                else if (operation.equals("6")) {
                                    continue outer;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Retry Password");
            }

             }
    }


