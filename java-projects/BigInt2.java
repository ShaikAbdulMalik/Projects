import java.math.BigInteger;
import java.util.Scanner;
public class BigInt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger c = null;
        
        for(int i = 2; i < n; i++) 
        {
            c = a.add(b);
            a = b;
            b = c;
        }
        System.out.println(b);
        // int a = 0;
        // int b = 1;
        // int c = 0;
        // for(int i = 2; i <= n; i++)
        // {
        //     c = a+b;
        //     a = b;
        //     b = c;
        // }
        // System.out.println(c);
        sc.close();
    }
}
