package Day_6;
import java.util.*;
public class PrintUniqueElements_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++)
        {
            int count = 0;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }
            if(count == 1)
                System.out.println(arr[i]);
        }
    }
}
