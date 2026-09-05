package Day_2;

import java.util.*;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        int count = 0;

        while(temp != 0)
        {
            temp/=10;
            count++;

        }
        temp = num;
        while(temp != 0)
        {
            int last = temp%10;
            int res = 1;
            for(int i=1; i<=count; i++)
            {
                res = res*last;
            }
            sum += res;
            temp /= 10;
        }
        System.out.println((sum == num)? "Armstrong Number" : "Not a Armstrong Number");
    }
}
