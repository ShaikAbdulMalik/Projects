import java.util.Scanner;
public class TestPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //pattern 1:
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        //pattern 2:
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        //pattern : 3
        for(int i = 1; i<= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print( j + " ");
            }
            System.out.println();
        }

        System.out.println();

        //pattern : 4
        for(int i = 1; i<= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print( i + " ");
            }
            System.out.println();
        }

System.out.println();

        //pattern : 5
        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j <= n; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        //pattern : 5
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n-i+1; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        //pattern : 6
        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j <= n; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        //pattern : 7
        for(int i = 0; i < n; i++)
        {
            // Space :
            for(int j = 0; j < n-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j++)
            {
                System.out.print("*");
            }
            // Space :
            for(int j = 0; j < n-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        //pattern : 8
        for(int i = 0; i < n; i++)
        {
            // Space :
            for(int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*n-(2*i+1); j++)
            {
                System.out.print("*");
            }
            // Space :
            for(int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        //pattern : 9
        for(int i = 0; i < n; i++)
        {
            // Space :
            for(int j = 0; j < n-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j++)
            {
                System.out.print("*");
            }
            // Space :
            for(int j = 0; j < n-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++)
        {
            // Space :
            for(int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*n-(2*i+1); j++)
            {
                System.out.print("*");
            }
            // Space :
            for(int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        
        // pattern : 10
        for(int i = 1; i <= 2*n-1; i++)
        {
            int star = i;
            if(i > n)
                star = 2*n-i;
            for(int j = 1; j <= star; j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
