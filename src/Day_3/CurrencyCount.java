package Day_3;
import java.util.*;

public class CurrencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();

        if(amt >= 1000) {
            System.out.println("Count of ₹1000 note: "+ amt/1000);
            amt %= 1000;
        }
        if(amt >= 500) {
            System.out.println("Count of ₹500 note: "+ amt/500);
            amt %= 500;
        }
        if(amt >= 200) {
            System.out.println("Count of ₹200 note: "+ amt/200);
            amt %= 200;
        }
        if(amt >= 100) {
            System.out.println("Count of ₹100 note: "+ amt/100);
            amt %= 100;
        }
        if(amt >= 50) {
            System.out.println("Count of ₹50 note: "+ amt/50);
            amt %= 50;
        }
        if(amt >= 20) {
            System.out.println("Count of ₹20 note: "+ amt/20);
            amt %= 20;
        }
        if(amt >= 10) {
            System.out.println("Count of ₹10 note: "+ amt/10);
            amt %= 10;
        }
        if(amt >= 5) {
            System.out.println("Count of ₹5 coin: "+ amt/5);
            amt %= 5;
        }
        if(amt >= 2) {
            System.out.println("Count of ₹2 coin: "+ amt/2);
            amt %= 2;
        }
        if(amt >= 1) {
            System.out.println("Count of ₹1 coin: "+ amt/1);
            amt %= 1;
        }
    }
}
