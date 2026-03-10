import java.math.BigInteger;
import java.util.Scanner;
public class BinIntPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();

        boolean result = n.isProbablePrime(10);
        if(result == true)
        {
            System.out.println("Its a prime");
        }
        else
        {
            System.out.println("Not a prime");
        }

        System.out.println("The next prime number is : "+n.nextProbablePrime());

        // System.out.println(n.isProbablePrime(1));
        // System.out.println(n.nextProbablePrime());
         sc.close();

    }
}
