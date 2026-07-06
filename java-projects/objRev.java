class Animal 
{
    String dog (String a)
    {
        System.out.println("Bark");
        return a;
    }
}
public class objRev
{
    public static void main(String[] args) {
          Animal a = new Animal();
          a.dog("");
    }
}