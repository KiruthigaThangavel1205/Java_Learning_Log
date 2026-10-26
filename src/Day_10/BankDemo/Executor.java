package Day_10.BankDemo;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter the amount: ");
        double amt = sc.nextDouble();

        sc.nextLine(); //consume leftover Enter

        System.out.print("Enter the user name: ");
        String userName = sc.nextLine();

        System.out.print("Enter the password: ");
        String password = sc.nextLine();


        Datas d = new Datas();
        d.setId(id);
        d.setName(name);
        d.setAmount(userName, password, amt);
        d.display(id, name, amt);
    }
}
