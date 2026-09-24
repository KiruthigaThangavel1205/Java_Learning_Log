package Day_9;
import java.util.*;
// O(n log n)
public class MergeSort {
    public static int[] divide(int[] arr)
    {
        if(arr.length == 1)
            return arr;

        int mid = arr.length/2;
        int left[] = new int[mid];
        int right[] = new int[arr.length-mid];
        int index = 0;

        for(int i=0; i<=left.length-1; i++)
            left[i] = arr[index++];

        for(int i=0; i<=right.length-1; i++)
            right[i] = arr[index++];

        left = divide(left);
        right = divide(right);

        return conquer(left, right);
    }

    public static int[] conquer(int[] left, int right[])
    {
        int i=0, j=0, k=0;
        int sort[] = new int[left.length + right.length];
        while(i<left.length && j<right.length)
        {
            if(left[i] < right[j])
                sort[k++] = left[i++];
            else
                sort[k++] = right[j++];
        }
        while(i<left.length)
            sort[k++] = left[i++];
        while(j<right.length)
            sort[k++] = right[j++];

        return sort;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        System.out.print("Enter the array elements: ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        int result[] = divide(arr);
        System.out.println(Arrays.toString(result));
    }
}
