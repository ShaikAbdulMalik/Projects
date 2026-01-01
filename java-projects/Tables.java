import java.util.Scanner;
public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The tables are : ");
        for(int i = 1; i <= 9; i++)
        {
            System.out.println(n * i);
        }
    }
    
}
