package Day_6;
import java.util.*;
public class MergeTwoArrays_SameSize {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int len = sc.nextInt();
        int arr1[] = new int[len];
        for(int i=0; i<arr1.length; i++)
        {
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[len];
        for(int i=0; i<arr2.length; i++)
        {
            arr2[i] = sc.nextInt();
        }

        int newArr[] = new int[arr1.length+arr2.length];
        for(int i=0; i<arr1.length; i++)
        {
            newArr[i] = arr1[i];
            newArr[arr1.length+i] = arr2[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
