package Day_4;

import java.util.*;
public class GcdArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array = {12, 24, 36, 5};
        System.out.println(gcdArray(array));
    }
    public static int gcdArray(int[] array)
    {
        int result = array[0];
        for(int i=0; i<array.length; i++)
        {
            result = gcd(result, array[i]);
        }
        return result;
    }
    public static int gcd(int a, int b)
    {
        return (b==0)? a : gcd(b, a%b);
    }
}
