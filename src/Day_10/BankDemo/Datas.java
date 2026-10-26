package Day_10.BankDemo;

public class Datas {
    private int id;
    private String name;
    private double amount;
    void setAmount(String userName, String password, double amount)
    {
        String uN="ABC@123";
        String pwd="098@123";
        if(uN.equals(userName) && pwd.equals(password))
        {
            if(amount>0)
            {
                System.out.println("Amount set...");
                this.amount = amount;
            }
            else
                System.out.println("Invalid Amount");
        }
        else System.out.println("UserName or Password is Invalid");
    }
    double getAmount()
    {
        return amount;
    }
    
    void setId(int id)
    {
        if(id>0)
            this.id=id;
        else System.out.println("Invalid ID");
    }
    int getId()
    {
        return id;
    }
    
    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return name;
    }
    
    void display(int id, String name, double amount)
    {
        System.out.println("ID: "+getId());
        System.out.println("Name: "+getName());
        System.out.println("Amount: "+getAmount());
    }
}
