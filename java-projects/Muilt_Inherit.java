interface A
{
    void show();
}
interface B 
{
    void display();
    int x = 10; // This is Final and Static Variable
}
class print implements A,B
{
    public void show()
    {
        System.out.println("Here is A show");
    }
    public void display()
    {
        System.out.println("Here is B display " + x);
        // B.x = 122; this gives error as final field cannot be reassigned 
    }
}
public class Muilt_Inherit {
    public static void main(String[] args) {
        
        print p = new print();
        p.show();
        p.display();
    }
}
