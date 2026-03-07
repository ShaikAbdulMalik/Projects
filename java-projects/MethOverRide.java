class Base
{
    void fun()
    {
        System.out.println("Base is fun");
    }
}
class Derived extends Base
{
    @Override
    void fun()
    {
        System.out.println("Derived is fun");
    }
}
public class MethOverRide {
    public static void main(String[] args) {
        Base b = new Derived();
        Base bb = new Base();

        b.fun();
        bb.fun();
    }
}
