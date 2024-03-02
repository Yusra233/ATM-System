package org.example;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SalaryAccount sl = new SalaryAccount();
        SavingAccount sa = new SavingAccount();
        CreditAccount c = new CreditAccount();


        String Menu1 = "       ATM SySteM       \n" +
                "--------------------------\n" +
                "Enter your password to LogIn: ";
        String Menu2 = "Choose Account:\n1. Salary Account\n2. Saving Account\n3. Credit Account";
        String Menu3 = "Choose Operation:\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Transfer\n5. Exit Account\n6. Exit Atm";


        outer: while (true) {
            System.out.println(Menu1);
            Scanner myPass = new Scanner(System.in);
            String pass;
            do {
                pass = myPass.nextLine();
                if (pass.length() != 4)
                    System.out.println("Try Again and Enter 4 digits only");
            } while (pass.length() != 4);
            while (true) {
                System.out.println(Menu2);
                Scanner myAcc = new Scanner(System.in);
                String acc;
                acc = myAcc.nextLine();
                // Salary Account
                while (true) {
                    if (acc.equals("1")) {
                        System.out.println("Salary Account");
                        System.out.println(Menu3);
                        Scanner myOp = new Scanner(System.in);
                        String op;
                        op = myOp.nextLine();
                        if (op.equals("1")) // Salary Account , Check Balance Operation
                        {
                            System.out.println(sl.CheckBalance());
                        } else if (op.equals("2")) // Salary Account , Deposit Operation
                        {
                            Scanner am = new Scanner(System.in);
                            System.out.println("Enter amount: ");
                            String ammm = am.nextLine();
                            int num = Integer.parseInt(ammm);
                            System.out.println(sl.Deposit(num));
                        } else if (op.equals("3")) // Salary Account , Withdraw Operation
                        {
                            Scanner wam = new Scanner(System.in);
                            System.out.println("Enter amount: ");
                            String wammm = wam.nextLine();
                            int wnum = Integer.parseInt(wammm);
                            System.out.println(sl.Withdraw(wnum));
                        } else if (op.equals("4")) {
                            Scanner acname = new Scanner(System.in);
                            System.out.println("Enter Account Name: ");
                            String ac = acname.nextLine();

                            Scanner tam = new Scanner(System.in);
                            System.out.println("Enter amount: ");
                            String tammm = tam.nextLine();
                            int tnum = Integer.parseInt(tammm);

                            System.out.println(sl.Transfer(acc,ac,tnum));

                        } else if (op.equals("5"))  // Salary Account , Exit Account
                        {
                            break;
                        }
                        else if (op.equals("6")) {
                            continue outer;
                        }
                    }

                    // Saving Account
                    else if (acc.equals("2")) {
                        System.out.println("Saving Account");
                        System.out.println(Menu3);
                        Scanner myOp1 = new Scanner(System.in);
                        String op1;
                        op1 = myOp1.nextLine();
                        if (op1.equals("1")) // Saving Account , Check Balance Operation
                        {
                            System.out.println(sa.CheckBalance());
                        } else if (op1.equals("2")) // Saving Account , Deposit Operation
                        {
                            Scanner am1 = new Scanner(System.in);
                            System.out.println("Enter amount: ");
                            String ammm1 = am1.nextLine();
                            int num1 = Integer.parseInt(ammm1);
                            System.out.println(sa.Deposit(num1));
                        } else if (op1.equals("3")) // Saving Account , Withdraw Operation
                        {
                            Scanner wam1 = new Scanner(System.in);
                            System.out.println("Enter amount: ");
                            String wammm1 = wam1.nextLine();
                            int wnum1 = Integer.parseInt(wammm1);
                            System.out.println(sa.Withdraw(wnum1));
                        }
                        else if (op1.equals("4")) {
                            Scanner acname1 = new Scanner(System.in);
                            System.out.println("Enter Account Name: ");
                            String ac1 = acname1.nextLine();

                            Scanner tam1 = new Scanner(System.in);
                            System.out.println("Enter amount: ");
                            String tammm1 = tam1.nextLine();
                            int tnum1 = Integer.parseInt(tammm1);

                            System.out.println(sa.Transfer(acc,ac1,tnum1));

                        }else if (op1.equals("5"))  // Saving Account , Exit Account
                        {
                            break;
                        }
                        else if (op1.equals("6")) {
                            continue outer;
                        }

                    }
                    // Credit Account
                    else {
                        System.out.println(Menu3);
                        Scanner myOp2 = new Scanner(System.in);
                        String op2;
                        op2 = myOp2.nextLine();

                        if (op2.equals("1")) // Credit Account , Check Balance Operation
                        {
                            System.out.println(c.CheckBalance());
                        } else if (op2.equals("2")) // Credit Account , Deposit Operation
                        {
                            Scanner am2 = new Scanner(System.in);
                            System.out.println("Enter amount: ");
                            String ammm2 = am2.nextLine();
                            int num2 = Integer.parseInt(ammm2);
                            System.out.println(c.Deposit(num2));
                        } else if (op2.equals("3")) // Credit Account , Withdraw Operation
                        {
                            Scanner wam2 = new Scanner(System.in);
                            System.out.println("Enter amount: ");
                            String wammm2 = wam2.nextLine();
                            int wnum2 = Integer.parseInt(wammm2);
                            System.out.println(c.Withdraw(wnum2));
                        }
                        else if (op2.equals("4")) {
                            Scanner acname2 = new Scanner(System.in);
                            System.out.println("Enter Account Name: ");
                            String ac2 = acname2.nextLine();

                            Scanner tam2 = new Scanner(System.in);
                            System.out.println("Enter amount: ");
                            String tammm2 = tam2.nextLine();
                            int tnum2 = Integer.parseInt(tammm2);

                            System.out.println(sl.Transfer(acc,ac2,tnum2));

                        }
                        else if (op2.equals("5"))  // Credit Account , Exit Account
                        {
                            break;
                        } else if (op2.equals("6")) {
                            continue outer;
                        }
                    }
                }

            }
        }
    }
}
