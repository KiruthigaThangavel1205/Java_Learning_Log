package Day_9;

import java.util.Arrays;

public class Merger2Sorted_Array {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {6, 7, 8, 9, 10, 11, 12};
        int sort[] = new int[arr1.length + arr2.length];

        int i=0, j=0, k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i] < arr2[j])
                sort[k++] = arr1[i++];
            else
                sort[k++] = arr2[j++];
        }
        while(i<arr1.length)
            sort[k++] = arr1[i++];
        while(j<arr2.length)
            sort[k++] = arr2[j++];

        System.out.println(Arrays.toString(sort));
    }
}
