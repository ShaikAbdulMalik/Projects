import java.util.*;
public class RowSum {
    public static void main(String[] args) {
        
        int [][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n = mat.length;
        int [] result = new int [n];

        for(int i = 0; i < n; i++)
        {
            int sum = 0;
            for(int j = 0; j < mat[i].length; j++)
            {
                sum += mat[i][j];
            }
            result[i] = sum;
        }
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
