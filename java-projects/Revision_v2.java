import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Revision_v2{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int hexa = 0xA;
        // System.out.println(hexa);
        int salary = 1_00_00_000;
        // System.out.println(salary);

        // operators
        int a = 10 % 3;
        int b = 10 / 3;
        // System.out.println(a);
        // System.out.println(b);

        // String concatenation
        // System.out.println(10 + 20 + "java"); // 30java
        // System.out.println("java" + 10 + 20); // java1020

        // Pre and Post increment/decrement
        int aa = 10;
        int bb = 20;

        // System.out.println(aa++); // 10 but stores 10+1
        // System.out.println(aa); // hencce the answer here is 11 
        // System.out.println(++aa); // here 11+1 = 12

        // System.out.println(aa++ + ++bb); // 10 + 21 = 31

        int x = 10^5;
        // System.out.println(x);

        // Shift Operators
        // System.out.println(10 << 5); 
        // Left shift formula = number * 2^n
        // here 10 * 2^5 = 10 * 32 = 320
        // System.out.println(20 >> 2); 
        // Right shift formula = number / 2^n
        // here 20 / 2^2 = 20 / 4 = 5

        // Conditonal Operators
        // int age = 17;
        // String result = age >= 18 ? "Adult" : "Minor";
        // System.out.println(result);
        
        // Instanceof operator
        // Checks whether an object belongs to a particular class or interface.
        // String text = "java";
        // System.out.println(text instanceof String);

        // INPUT = BUFFEREDREADER
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.in = convert the text given into bytes
        // InputStreamReader = converts that bytes into characters
        // BufferedReader efficently reads the character ot text

        // String name = br.readLine(); // Always returns the value as Strings
        // System.out.println("My Name is : " + name);

        // int year = Integer.parseInt(br.readLine());
        // System.out.println("The year is : " + year);

        // Use Scanner for simple programs and easier datatype input.
        // Use BufferedReader when faster input is required or when reading large amounts of text.

        // Enhanced loop :
        // int[] arr = {1,2,3};
        // for(int i  : arr)
        // {
        //     System.out.println(i);
        // }

        // do while loop :
        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i++;
        // } while(i<=5);

        // problem :
        // int[] numbers = {4, 2, 7, 2, 4};
        // int unique = 0;
        // for(int i : numbers)
        // {
        //     unique = unique ^ i;
        // }
        // System.out.println("unique number : " + unique);

        // Method calling :
        // int result = method(10,20);
        // System.out.println(result);

        // Recursion :
        // Recursion is a function that calls itself till the base condition is fullfilled 
        // countDown(5);

        // Varargs:
        System.out.println(add(10,20,30));
    }
    //Recursive method:
    // static void countDown(int number)
    // {
    //     if(number == 0)
    //     {
    //         return;
    //     }
    //     System.out.println(number);
    //     countDown(--number);
    // }

    // Methods:
    //     public static int method (int a, int b){
    //         int sum = a + b;
    //         return sum;        
    // }
    
    // Varargs : variable length arguments
        static int add(int...n)
        {
            int sum = 0;
            for(int number : n)
            {
                sum += number;
            }
            return sum;
        }        
}