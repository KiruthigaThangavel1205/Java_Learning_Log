package Day_1;
import java.util.*;

public class EvenSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num>>1)<<1 == num)
            System.out.println("Square of the even number: "+num*num);
        else
            System.out.println("Not a even number...");
    }
}
