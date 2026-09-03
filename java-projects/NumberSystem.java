import java.util.Scanner;
import java.lang.Math;
public class NumberSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // problem 1: count the number of digits :
        // int count = 0;
        // int temp = n;

        // if(temp == 0)
        // {
        //         count = 1;
        // }
        // else{
        //         while(temp!=0)
        //         {
        //                 count++;
        //                 temp = temp / 10;
        //         }
        // }
        // System.out.println(count);

        // problem 2: sum of digits in a number
        // int temp = n;
        // int sum = 0;
        // while(temp!=0)
        // {
        //         int digit = temp % 10;
        //         sum = sum + digit;
        //         temp = temp/10;
        // }
        // System.out.println(sum);

        // problem 3: SPY number:
        // int temp = n;
        // int sum = 0;
        // int product = 1;
        // while(temp != 0)
        // {
        //         int digits = temp % 10;
        //         sum = sum + digits;
        //         product = product * digits;
        //         temp = temp / 10;
        // }
        // if(sum == product)
        // {
        //         System.out.println("spy number");
        // }else{
        //         System.out.println("Nope....");
        // }

        // problem 4: Perfect number:
        // int sum = 0;
        // for(int i = 1; i <= n/2; i++)
        // {
        //         if(n%i == 0)
        //         {
        //                 sum = sum + i;
        //         }
        // }
        // if(n > 0 && sum == n)
        // {
        //         System.out.println("Perfect number");
        // } else {
        //         System.out.println("not a perfect number");
        // }

        // problem 5: Reversing a number :
        // int temp = n;
        // int reverse = 0;
        // while(temp != 0)
        // {
        //         int digits = temp % 10;
        //         reverse = reverse * 10 + digits;
        //         temp = temp / 10;
        // }
        // System.out.print(reverse);

        // problem 6 : palindrome 
        // int temp = n;
        // int reverse = 0;
        // while(temp != 0)
        // {
        //         int digits = temp % 10;
        //         reverse = reverse * 10 + digits;
        //         temp = temp / 10;
        // }
        // if(n == reverse)
        // {
        //         System.out.println("Palindrome");
        // }
        // else{
        //         System.out.println("Not a palindrome");
        // }

        // problem no : 7 : Armstrong number:
        // int temp = n;
        // int count = 0   ;
        // if(temp == 0)
        // {
        //         count = 1;
        // }
        // else
        // {
        //         while(temp != 0)
        //         {
        //                 count++;
        //                 temp = temp / 10; 
        //         }
        // }
        // // Reset temp 
        // temp = n;
        // int sum = 0;
        //  Calculate Armstrong number 
        // while(temp != 0)
        // {
        //         int digit = temp % 10;
        //         int power = 1;
        //         for(int i = 1; i <= count; i++)
        //         {
        //                 power = power * digit;
        //         }
        //         sum = sum + power;
        //         temp = temp/10;
        // }
        // if(n == sum)
        // {
        //         System.out.println("Armstrong number");
        // }
        // else
        // {
        //         System.out.println("Not an Armstrong number");
        // }

        // problem no : 8 : Prime number:
        // if(n <= 1)
        // {
        //         System.out.println("Not a prime number");
        // }
        // else{
        //         boolean isPrime = true;
        //         for(int i = 2; i*i <= n; i++)
        //         {
        //                 if(n%i == 0)
        //                 {
        //                         isPrime = false;
        //                         break;
        //                 }
        //         }
        //         if(isPrime)
        //         {
        //                 System.out.println("Prime number");
        //         }
        //         else{
        //                 System.out.println("Not prime");
        //         }
        // }

        // Problem : Factorial using recursion
        // int result = factorial(5);
        // System.out.println(result);

        // Problem : Sum of a number:
//         int result = sum(3);
//         System.out.println(result);

        // Armstrong number :
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        int digits = 0;
        int count = 0;
        double sum1 = 0;
        int temp1 = n;

        while(temp1 != 0)
        {
            digits = temp1 % 10;
            temp1 = temp1 / 10;
            count++;
            System.out.println(digits);
        }
        
        System.out.println("The number of digits are : " + count);

        int num = 0;
        int temp2 = n;
        while(temp2 != 0)
        {
            num = temp2 % 10;
            temp2 = temp2 /10;
            sum1 = Math.pow(num, count) + sum1;
        }
        
        if((int)sum1 == n)
        {
            System.out.println("Armstrong number : " + sum1);
        } else {
            System.out.println("Not an Armstrong number");
        }

        // Neon Numbers:
        System.out.println("Enter the number : ");
        int x = sc.nextInt();
        int square = x * x;
        int sum = 0;
        int temp = square;
        while(temp != 0)
        {
                int digit = temp % 10;
                sum = sum + digit;
                temp = temp / 10;
        }
        System.out.println("The square of the number is : " + square);
        System.out.println("The sum of the numbers is : "+ sum);
        if(sum == x)
        {
                System.out.println("neon number");
        } else {
                System.out.println("Not neon");
        }

        // Automorphic numbers:
        System.out.println("Enter the Number :");
        int m = sc.nextInt();
        int square1 = m * m;
        int tempSquare = square1;
        int tempM = m;
        boolean isAutomorphic = true;

        while(tempM > 0)
        {
                if(tempM % 10 != tempSquare % 10)
                {
                        isAutomorphic = false;
                        break;
                }
                tempM = tempM /10;
                tempSquare = tempSquare /10;
        }

        System.out.println("Square : " + square1);

        if(isAutomorphic)
        {
                System.out.println("The number is Automorphic " + m);
        } else {
                System.out.println("The number is not AutoMorphic");
        }

        // Factorial :
        System.out.println("Enter the number : ");
        int c = sc.nextInt();
        long factorial = 1;

        for(int i = 1; i <= c; i++)
        {
                factorial = factorial * i;
        }
        System.out.println("The Factorial of " + c +" is : " + factorial);

        // Fibonacci Series :
        System.out.print("Enter the number : ");
        int terms = sc.nextInt();

        int first = 0;
        int second = 1;
        System.out.println("The Fibonacci series is :");
        for(int i = 1; i <= terms; i++)
        {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next; 
        }
        System.out.println();

        // GCD and LCM:
        System.out.println("Enter the First number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number : ");
        int b = sc.nextInt();

        int n1 = a;
        int n2 = b;

        while(n2 != 0)
        {
                int temp4 = n2;
                n2 = n1 % n2;
                n1 = temp4;
        }
        int gcd = n1;
        System.out.println("The GCD is : " + gcd);
        int lcm = (a * b) / gcd;
        System.out.println("The LCM is : " + lcm);

     }
}       


