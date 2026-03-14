
public class ThrowJava {
    public static void main(String[] args) {
        
        int age = 10;
        if(age < 18)
        {
            throw new ArithmeticException("You are underage");
        }
        System.out.println("OK!");

    }
}
