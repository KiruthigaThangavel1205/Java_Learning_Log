package Day_8;

public class Nth_SmithNumber {
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
        int count = 0;
        int nth = 17;
        int res = 0;
        for(int k=1; count<nth; k++)
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
            {
                count++;
                res = temp;
            }
        }
        if(count == nth)
            System.out.println(res);
    }
}
