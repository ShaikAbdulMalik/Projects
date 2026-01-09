import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        // int i = 1;
        // while(i<=5)
        // {
        //     System.out.println("*");
        //     i++;
        // }
        // int j = 1;
        // while(j<=5)
        // {
        //     System.out.print(" * ");
        //     j++;
        // }

        // int n = 5;
        // int i = 1;
        // while(i <= n)
        // {
        //     int j = 1;
        //     while (j <= i) // Here j is the columns and i is the rows
        //     {
        //         System.out.print(" * ");
        //         j++;
        //     }
        //     System.out.println(" ^ ");
        //     i++;
        // }
       
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++)
        // {
        //     for(int j = i; j<=n; j++)
        //     {
        //         System.out.print(" * ");
        //     }
        //     System.out.println("  ");
        // }

        // sc.close();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    //    int i = 1;
    //    while(i <= n)
    //    {
    //         int j = 1;
    //         while(j <= n-i)
    //         {
    //             System.out.print("  ");
    //             j++;
    //         }
    //         while(j <= n)
    //         {
    //             System.out.print(" * ");
    //             j++;
    //         }
    //     i++;
    //     System.out.println();
    //    }

    //inverted trinagle
        // for(int i = 1; i<=n; i++)
        // {
        //     for(int j = 1; j <= n-i; j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i; j++)
        //     {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // Normal Right angled triangle
        // for(int i = 1; i <= n; i++)
        // {
        //     for(int j = 1; j <= i; j++) // To print Stars
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println(" "); // To print spaces
        // }

        // Square pattern
        // for(int i = 1; i <= n; i++)
        // {
        //     for(int j = 1; j <= n; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    
        // Pyramid pattern
        // for(int i = 1; i <= n; i++ ) // Controls the number of rows
        // {
        //     for(int j = 1; j <= n - i; j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= 2*i-1; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // print right angle triangle of size n
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        

    }    

}
