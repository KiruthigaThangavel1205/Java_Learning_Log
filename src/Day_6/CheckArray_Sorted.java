package Day_6;
import java.util.*;
public class CheckArray_Sorted {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean check = true;
        for(int i=0; i<arr.length-1; i++)
        {
            if (arr[i] > arr[i+1])
            {
                check = false;
                break;
            }
        }
        System.out.println(check?"Sorted":"Not Sorted");
    }
}
