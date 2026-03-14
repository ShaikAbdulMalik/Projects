class illegalAgeException extends Exception
{
    illegalAgeException(String msg)
    {
        super(msg);
    }
}
class voter {
    public String name;
    public int age;
    voter(String n, int a) throws illegalAgeException{
        name = n;
        age = a;
        if(a<18)
        {
            throw new illegalAgeException("UNderage");
        }
    }
}
public class UserDefined {
    // static void checkAge (int age) throws illegalAgeException
    // {
    //     if(age < 18)
    //     {
    //         throw new illegalAgeException("Age must be above 18");
    //     }
    //     else{
    //         System.out.println("Elegible");
    //     }
    // }
   public static void main(String[] args) {
    // try{
    //     checkAge(11);
    // }
    // catch(illegalAgeException e){
    //     System.out.println(e);
    // }
    voter p = null;
    try{
        p = new voter("Malik", 10);
    }
    catch(illegalAgeException e)
    {
        System.out.println(e);
        e.printStackTrace();
    }
   } 
}
