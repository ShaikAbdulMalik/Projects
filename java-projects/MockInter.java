public class MockInter {
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static int disp()
    {
        return add(10,20);
    }
    public static void main(String[] args) {

        double d = 10.3;
        int a = (int)d;
        System.out.println(a);

        int x = 130;
        byte b = (byte)x;
        System.out.println(b);
        double res = d+x;
        System.out.println(res);

        System.out.println(disp());

    }   
}
