import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 1;
        int x = Math.min(a, b); // This is used to find the minimum of two Numbers

        for(int i = 1; i<=x; i++)
        {
            if(a%i==0 && b%i==0)
            {
                ans = i;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
