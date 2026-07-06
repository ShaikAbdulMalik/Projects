import java.util.*;
public class Toperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number : ");
        int num2 = sc.nextInt();

        int res = num1 > num2 ? num1 : num2;
        System.out.println(res);

        sc.close();

    }
}
