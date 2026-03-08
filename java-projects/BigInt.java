import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args) {
        
        BigInteger a = new BigInteger("100");
        BigInteger b = new BigInteger("20");

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));

        BigInteger a1 = BigInteger.valueOf(100);
        BigInteger a2 = BigInteger.valueOf(20);
        BigInteger a3 = BigInteger.valueOf(100);
        
        System.out.println();

        System.out.println(a1.compareTo(a2)); // a1 = 100 > a2 = 20
        System.out.println(a2.compareTo(a1)); // a2 = 20 < a1 =100
        System.out.println(a1.compareTo(a3)); // a3 = 100 = a3 = 100

        /*Some of the others are pow,max,min.abs(Absolute value),gcd etc */
    }
}
