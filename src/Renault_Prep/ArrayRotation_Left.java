package Renault_Prep;

// [1, 2, 3, 4, 5]   ->   [3, 4, 5, 1, 2]

public class ArrayRotation_Left {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        for(int rot=1; rot<=d; rot++)
        {
            int first = arr[0];
            for(int i=0; i<arr.length-1; i++)
            {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = first;
        }

        //Printing Array
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
