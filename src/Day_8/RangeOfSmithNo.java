package Day_8;

public class RangeOfSmithNo {
    static int sumOfEachDigit(int temp)
    {
        int sum=0;
        while(temp > 0)
        {
            sum += temp%10;
            temp /= 10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int start = 1;
        int end = 667;
        for(int k=start; k<=end; k++)
        {
            int num = k;
            int temp = num;
            int sum = 0;
            for(int i=2; i<=num; i++)
            {
                while(num%i==0)
                {
                    sum+=sumOfEachDigit(i);
                    num/=i;
                }
            }
            if(sumOfEachDigit(temp) == sum)
                System.out.println(temp);
        }
    }
}