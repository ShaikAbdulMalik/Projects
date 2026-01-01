import java.util.Scanner;
public class LeapYr {
    public static void main(String[] args) {
        
        // Leap years are always divisible by 4
        // Rules for Leap Year
        // (1) Divisible by 4 but not divisible by 100 then it is a leap year
        // (2) Divisible by 400 then it is a leap year
        // note: it is 2100, 2300, 2200

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int year = sc.nextInt();

        if(year%4 == 0 && year%100 != 0)
        {
            System.out.println("Yes, it is a leap year");
        }
        else if (year%400 == 0) {
            System.out.println("Yes, it is a leap year");
        }
        else
        {
            System.out.println("No, it is not a leap year");
        }

        sc.close();


    }    
}
