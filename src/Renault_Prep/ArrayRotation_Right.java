package Renault_Prep;
//[1, 2, 3, 4, 5]   ->  [4, 5, 1, 2, 3]
public class ArrayRotation_Right {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;

        for(int rot=1; rot<=d; rot++)
        {
            int last = arr[arr.length-1];
            for(int i=arr.length-1; i>0; i--)
            {
                arr[i] = arr[i-1];
            }
            arr[0] = last;
        }

        //Printing Array
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
