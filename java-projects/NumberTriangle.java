import java.util.Scanner;
public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) // This is used to set rows or the number of rows 
        {
            for(int j = 1; j <= n-i; j++) // this is used to set the number of Spaces
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) // this is used to set the numbers
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
