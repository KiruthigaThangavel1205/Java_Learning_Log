package Day_4;

import java.util.*;
public class Lcm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(lcm(n1, n2));
    }
    public static int lcm(int a, int b)
    {
        return (a*b)/gcd(a,b);
    }
    public static int gcd(int a, int b)
    {
        return (b==0)? a : gcd(b,a%b);
    }
}
