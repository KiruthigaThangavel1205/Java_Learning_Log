package Day_1;
import java.util.*;
public class lastDig5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%10 == 5)
            System.out.println("Last digit of a given number is 5");
        else
            System.out.println("No...");
    }
}
