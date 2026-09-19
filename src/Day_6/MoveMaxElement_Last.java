package Day_6;
import java.util.*;
public class MoveMaxElement_Last {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length-1; i++)
        {
            if (arr[i] > arr[i+1]) {
                arr[i] = arr[i]+arr[i+1];
                arr[i+1] = arr[i] - arr[i+1];
                arr[i] = arr[i] - arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
