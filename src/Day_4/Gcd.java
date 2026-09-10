package Day_4;

import java.util.*;
public class Gcd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println(gcd(n1, n2));
    }
    public static int gcd(int a, int b)
    {
        return (b==0)? a : gcd(b, a%b);
    }
}
