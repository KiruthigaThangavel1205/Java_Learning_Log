package Day_5;

public class RowWithMaxSum {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int maxSum = 0;
        int maxRow = 0;

        for(int i=0; i<arr.length; i++)
        {
            int sum =0;
            for(int j=0; j<arr.length; j++)
            {
                sum += arr[i][j];
            }
            if(sum > maxSum)
            {
                maxSum = sum;
                maxRow = i;
            }
        }
        System.out.println("Maximum row: "+ (maxRow+1));
        System.out.println("Maximum sum of the row: "+ maxSum);
    }
}
