package Day_9;

import java.util.Arrays;

public class DivideArray {
    public static void main(String[] args) {
        int imp[] = {38, 27, 43, 3, 9, 82, 10};
        int mid = imp.length/2;
        int arr1[] = new int[mid];
        int arr2[] = new int[imp.length-mid];

        int index = 0;
        for(int i=0; i<arr1.length; i++)
            arr1[i] = imp[index++];
        for(int i=0; i<arr2.length; i++)
            arr2[i] = imp[index++];

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
