package Renault_Prep;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 40, 80, 70, 40};
        for(int i=0; i<arr.length; i++)
        {
            boolean dup = false;
            for(int j=0; j<i; j++)
            {
                if(arr[i] == arr[j])
                {
                    dup = true;
                    break;
                }
            }
            if(!dup) System.out.print(arr[i]+" ");
        }
    }
}
