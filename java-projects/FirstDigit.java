public class FirstDigit {
    public static void main(String[] args) {
        int x = 1;
        int result = first(x);
        System.out.println(result);
    }
    public static int first(int x)
    {
        while(x >= 10)
        {
            x=x/10;
        }
        return x;
    }
}
