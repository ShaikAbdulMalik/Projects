import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the First Number : ");
        int n1 = sc.nextInt();
        
        System.out.println("Enter the Second Number : ");
        int n2 = sc.nextInt();

        System.out.println("Choose Operator : ");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplaction");
        System.out.println("4. Division");

        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Result = " + (n1+n2));
                break;
            case 2 :
                System.out.println("Result = " + (n1-n2));
                break;
            case 3:
                System.out.println("Result = " + (n1*n2));
                break;
            case 4:
                if(n2 != 0)
                System.out.println("Result = " + (n1/n2));
                else
                    System.out.println("Division is not allowded by zero");
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}


