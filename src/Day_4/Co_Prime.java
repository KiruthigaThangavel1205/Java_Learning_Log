package Day_4;

import java.util.*;
public class Co_Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter Num1: ");
        System.out.println("Enter Num2: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        boolean result = coPrime(n1, n2);
        System.out.println(result);
    }
    public static boolean coPrime(int a, int b)
    {
        return gcd(a,b)==1;
    }
    public static int gcd(int a, int b)
    {
        return (b==0)? a : gcd(b, a%b);
    }
}
