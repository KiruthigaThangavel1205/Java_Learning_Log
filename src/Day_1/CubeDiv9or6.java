package Day_1;
import java.util.*;
public class CubeDiv9or6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%9==0 && num%6==0)
            System.out.println(num*num*num);
        else
            System.out.println("Not Divisible...");
    }
}
