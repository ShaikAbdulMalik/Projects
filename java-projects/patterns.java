import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
    // pattern no 1
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }

    System.out.println();

    // patterns no 2
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }

    System.out.println();

    // pattern no 3
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            System.out.print(j +" ");
        }
        System.out.println();
    }

        System.out.println();

    // pattern no 4
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            System.out.print(i +" ");
        }
        System.out.println();
    }

        System.out.println();

    // pattern no 5
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= n-i+1; j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }

        System.out.println();

    // pattern no 6
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= n-i+1; j++)
        {
            System.out.print(j +" ");
        }
        System.out.println();
    }

        System.out.println();

    // pattern no 7
    for(int i = 0; i < n; i++)
    {
        // Space
        for(int j = 0; j < n-i-1; j++)
        {
            System.out.print(" ");
        }
        // Star
        for(int j = 0; j < 2*i+1; j++)
        {
            System.out.print("* ");
        }
        // Space
        for(int j = 0; j < n-i-1; j++)
        {
            System.out.print(" ");
        }
    System.out.println();
    }

            System.out.println();

    // pattern no 8
    for(int i = 0; i < n; i++)
    {
        // Space 
        for(int j = 0; j < i; j++)
        {
            System.out.print(" ");
        }
        // Stars
        for(int j = 0; j < 2*n-(2*i+1); j++)
        {
            System.out.print("* ");
        }
        // Space 
        for(int j = 0; j < i; j++)
        {
            System.out.print(" ");
        }
        System.out.println();
    }

    System.out.println();

    // pattern no : 9
    for(int i = 0; i < n; i++)
    {
        // Space
        for(int j = 0; j < n-i-1; j++)
        {
            System.out.print(" ");
        }
        // Star
        for(int j = 0; j < 2*i+1; j++)
        {
            System.out.print("* ");
        }
        // Space
        for(int j = 0; j < n-i-1; j++)
        {
            System.out.print(" ");
        }
        
    System.out.println();
    }    
    for(int i = 0; i < n; i++)
    {
        // Space 
        for(int j = 0; j < i; j++)
        {
            System.out.print(" ");
        }
        // Stars
        for(int j = 0; j < 2*n-(2*i+1); j++)
        {
            System.out.print("* ");
        }
        // Space 
        for(int j = 0; j < i; j++)
        {
            System.out.print(" ");
        }
        System.out.println();
    }

    System.out.println();

        //pattern no : 10
        for(int i = 1; i <= 2*n-1 ; i++) // this is because it has 9 rows : 5 increasing and 4 decreasing
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

        System.out.println();

        // pattern no : 11
        int start;
        for(int i = 0; i <= n; i++)
        {
            if(i % 2 == 0)
                start = 1;
            else
                start = 0;
            for(int j = 0; j<= i; j++)
            {
                System.out.print(start + " ");
                start = 1-start;
            }
            System.out.println();
        }

        System.out.println();

        // pattern no : 12
        for(int i = 1; i <= n; i++)
        {
            //left
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            //space
            for(int j = 1; j <= 2*(n-i); j++)
            {
                System.out.print(" ");
            }
            //right
            for(int j = i; j >= 1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        // Pattern no : 13 (floyd's triangle)
        int count = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        System.out.println();

        // Pattern no : 14
        for(int i = 1; i <= n; i++)
        {
            char ch = 'A';
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        System.out.println();

        // pattern no 15:
        for(int i = 1; i <= n; i++)
        {
            char ch = 'A';
            for(int j = 1; j <= n-i+1; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        System.out.println();

        // Pattern no : 16
        char ch = 'A';
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
                {
                    System.out.print(ch);
                }
                ch++;
                System.out.println();
        }

System.out.println();

        // pattern no : 17
        for(int i = 0; i < n; i++)
        {
            // spaces
            for(int j = 0; j < n-i-1; j++)
            {
                System.out.print(" ");
            }
            // characters 
            char ch2 = 'A';
            int breakpoint = (2*i+1)/2;         // this is because the pattern is ABA how do i stop it from goint on to ABC
                                                // this is how i stop it by using a break point 
            for(int j = 1; j <= 2*i+1; j++)
            {
                System.out.print(ch2 + " ");
                if(j <= breakpoint)
                    ch2++;
                else
                    ch2--;
            }
            // spaces
            for(int j = 0; j < n-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

System.out.println();

        // Pattern no 18 :
        for(int i = 1; i <= n; i++)
        {
            char ch3 = (char)('A'+n-i);
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch3+ " ");
                ch3++;
            }
            System.out.println();
        }

System.out.println();

        // Pattern no 21:
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == 0 || j == 0 || i == n-1 || j == n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

System.out.println();

        // pattern no : 22
        // System.out.println("Enter the number of rows : ");
        // int row = sc.nextInt();
        // System.out.println("Enter the number of columns : ");
        // int col = sc.nextInt();
        // for(int i = 1; i <= row; i++)
        // {
        //     for(int j = 1; j <= col; j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

System.out.println();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i +1; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
