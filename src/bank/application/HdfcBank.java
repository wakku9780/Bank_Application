package bank.application;

import java.util.UUID;

public class HdfcBank implements Bankinterface {
    private int balance;
    private String accountNo;
    private String password;
    private String name;
    public static double rateOfInterest;

    public HdfcBank(int balance, String password, String name) {
        this.accountNo= UUID.randomUUID().toString();
        this.balance = balance;
        this.password = password;
        this.name = name;
    }

    @Override
    public int checkBalance(String password) {
        if(password==this.password)return balance;
        return -1;
    }

    @Override
    public String addMoney(int money) {

        balance=balance+money;
        String message =money+"hasbeen added to the account"+accountNo;


        return message;
    }

    @Override
    public String withdrawMoney(int money, String password) {
        if(password==this.password){
            if(money>balance)return "Insufficient balance";
            else {
                balance=balance-money;
                return "money withdraw successfully";
            }
        }
        return "wrong password";
    }

    @Override
    public String changePassword(String oldpassword, String newpassword) {
        if(this.password==oldpassword){
            this.password=newpassword;
            return "password hasbeen successfully";
        }
        return "wrong password";
    }

    @Override
    public double calculatetotelIntrest(int years) {
        double interest =balance*rateOfInterest/100;
        return interest;
    }
}
