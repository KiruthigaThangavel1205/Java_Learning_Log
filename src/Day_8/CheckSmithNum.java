package Day_8;

public class CheckSmithNum {
    static int sumOfEachDigit(int temp)
    {
        int sum=0;
        while(temp > 0)
        {
            sum+=temp%10;
            temp/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 666;
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
        System.out.println((sumOfEachDigit(temp) == sum)? "Smith No" : "Not a Smith No");
    }
}
