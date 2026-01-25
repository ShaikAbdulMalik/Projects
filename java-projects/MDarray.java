public class MDarray {
    public static void main(String[] args) {
        int n = 3;
        int m = 2;

        int [][]a = new int[n][m];
        int count = 1;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                a[i][j] = count;
                count++;
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        
    }   
}
