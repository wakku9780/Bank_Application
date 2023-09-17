package bank.application;

public interface Bankinterface {
    public int checkBalance(String password);

    public String addMoney(int money);



    public String withdrawMoney(int money, String password);

    public String changePassword(String oldpassword,String newpassword);

    public double calculatetotelIntrest(int years);
}
