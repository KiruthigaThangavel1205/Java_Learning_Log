package Day_5;

public class ColumnWithMaxSum {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maxSum = 0;
        int maxCol = 0;

        for(int j=0; j<arr.length; j++)
        {
            int sum=0;
            for(int i=0; i<arr.length; i++)
            {
                sum += arr[i][j];
            }
            if(sum > maxSum)
            {
                maxSum = sum;
                maxCol = j;
            }
        }
        System.out.println("Maximum Column: "+(maxCol+1));
        System.out.println("Maximum sum in a column: "+ maxSum);
    }
}
