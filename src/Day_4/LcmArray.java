package Day_4;

import java.util.*;
public class LcmArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array = {12, 24, 36};
        System.out.println(lcmArray(array));
    }
    public static int lcmArray(int[] array)
    {
        int result = array[0];
        for (int i = 1; i < array.length; i++)
        {
            result = lcm(result, array[i]);
        }
        return result;
    }
    public static int lcm(int a, int b)
    {
        return (a*b) / gcd(a,b);
    }
    public static int gcd(int a, int b)
    {
        return (b==0)? a : gcd(b, a%b);
    }
}
