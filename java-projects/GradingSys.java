import java.util.Scanner;
public class GradingSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double marks = 0;
        double totalMarks = 0;
        System.out.println("Enter the number of subjects : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            System.out.println("Enter the marks for " + i + " subject : ");
            marks = sc.nextDouble();
            totalMarks += marks;
        }
        System.out.println("The total marks are : " + totalMarks);
        double avg = totalMarks/n;
        System.out.println("Average marks : " + avg);

        if(avg >= 90)
            System.out.println("O");
        else if(avg >= 75)
            System.out.println("A");
        else if(avg >= 60)
            System.out.println("B");
        else if(avg >= 50)
            System.out.println("C");
        else if(avg >= 35)
            System.out.println("D");
        else
            System.out.println("Fail");

        sc.close();

    }
}
