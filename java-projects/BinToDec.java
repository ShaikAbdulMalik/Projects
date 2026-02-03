public class BinToDec {
    public static void main(String[] args) {
        String s = "101110";
        int decimal = 0;
        int power = 0;
        int n = s.length();
        System.out.println(n);
        
        for(int i = n-1; i >= 0; i--)
        {
            int bit = s.charAt(i) - '0';
            decimal = decimal + bit*(int)Math.pow(2, power);
            power++;
        }

        System.out.println(decimal);
    }    
}
