package Day_1;
import java.util.*;
public class ThreeDigNum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        while(num!=0)
        {
            int rem = num%10;
            count++;
            num/=10;
        }
        if(count==3)
            System.out.println("3 Digit number...");
        else
            System.out.println("No...");

    }
}
