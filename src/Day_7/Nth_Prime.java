package Day_7;

public class Nth_Prime {
    public static void main(String[] args) {
        int nth = 7;
        int count = 0;
        for(int num=2; count < nth; num++)
        {
            boolean prime = true;
            for(int i=2; i<num; i++)
            {
                if(num%i==0)
                {
                    prime = false;
                    break;
                }
            }
            if(prime)
                count++;
            if(count == nth)
                System.out.println(num);
        }
    }
}
