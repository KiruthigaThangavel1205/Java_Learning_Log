package Day_7;

public class SecondLargest_Array {
    public static void main(String[] args) {
        int arr[] = {10, 20, 50, 40, 30};
        int fMax = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > fMax)
            {
                sMax = fMax;
                fMax = arr[i];
            }
            else if(arr[i]>sMax && arr[i]!=fMax)
                sMax = arr[i];
        }
        System.out.println("First Maximum: "+fMax);
        System.out.println("Second Maximum: "+sMax);
    }
}
