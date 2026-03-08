import java.util.Scanner;
import java.math.BigInteger;
public class BigInt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger f = new BigInteger("1");
        int n = sc.nextInt();
        BigInteger b = null; // this initializes b

        for(int i = 1; i<=n ; i++)
        {
            b = BigInteger.valueOf(i);
            f = f.multiply(b);
        }
        System.out.println(f);
        sc.close();
    }
}
