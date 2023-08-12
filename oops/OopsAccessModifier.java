package oops;

public class OopsAccessModifier {
    public static void main(String args[])
    {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "raushan";
        myAcc.setPassword("abcd");

    }
    
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd)
    {
        password = pwd;
    }
}
