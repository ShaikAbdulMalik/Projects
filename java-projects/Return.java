import java.util.Scanner;
public class Return {
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static int sub(int a, int b)
    {
        return a-b;
    }
    public static int mul(int a, int b)
    {
        return a*b;
    }
    public static int div(int a, int b)
    {
        return a/b;
    }
    public static int mod(int a, int b)
    {
        return a%b;
    }
    public static double circleArea(int c)
    {
        double pi = Math.PI;
        return pi*c*c;
    }
    public static double circlePerimeter(int c)
    {
        double pi = Math.PI;
        return 2*pi*c;
    }
    public static void add1()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition without parameters : " + (a+b));
    }
    public static void sub1()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Substraction without parameters : " +(a-b));
    }
    public static void mul1()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Multiplication without parameters : " + (a*b));
    }
    public static void div1()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Division without parameters : " + (a/b));
    }
    public static void mod1()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Mod without parameters : " + a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        // with parameters : 
        System.out.println("Addition : "+add(a, b));
        System.out.println("Substraction : "+sub(a, b));
        System.out.println("Multiplication : "+mul(a, b));
        System.out.println("Divison : "+div(a, b));
        System.out.println("Modulus : "+mod(a, b));
        // without parameters : 
        add1();
        sub1();
        mul1();
        div1();
        mod1();

        System.out.println("Enter the radius of the circle :");
        int c = sc.nextInt();
        System.out.println("Area : "+circleArea(c));
        System.out.println("Perimeter : " + circlePerimeter(c));
        sc.close();
    }
}
