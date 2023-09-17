package bank.application;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        SBI.rateOfInterest=7;
        HdfcBank.rateOfInterest=6;

        SBI account1=new SBI(100000,"123","waqar");
        SBI account2 = new SBI(75000,"456","sanaya");

        HdfcBank account3 = new HdfcBank(50000,"789","sisodiya");

        int balance =account1.checkBalance("124");
        System.out.println("the balance for account1 is "+balance);

        int balance1 =account1.checkBalance("123");
        System.out.println("the balance for account1 is "+balance1);

        String bankMessage =account2.addMoney(50000);
        System.out.println(bankMessage);

        String message =account3.withdrawMoney(10000,"1234");
        System.out.println(message);

        String message1 =account3.withdrawMoney(10000,"789");
        System.out.println(message1);

        double interest=account1.calculatetotelIntrest(20);
        System.out.println("totel interest you will get "+interest);

        double interest1=account3.calculatetotelIntrest(20);
        System.out.println("totel interest you will get "+interest1);

        System.out.println("Make it Dynamic");

        System.out.println("welcome to the SBI,plz enter the details for creating account");

        System.out.println("Enter the Name");

        Scanner sc = new Scanner(System.in);

        String name =sc.next();

        System.out.println("enter the balance");
        int balance3=sc.nextInt();

        System.out.println("Enetr ppassword");
        String password =sc.next();

        SBI sbiAccount = new SBI(balance3,password,name);

        System.out.println("Enter Money and password To Add");
        int money=sc.nextInt();
        String message3=sbiAccount.addMoney(money);
        System.out.println(message3);



    }
}
