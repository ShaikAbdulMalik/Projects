public class TryCatchFinally {
    public static void main(String[] args) {
        try
        {
            int a = 10;
            int b = 0;
            
            int [] arr = new int[2];
            System.out.println(arr[3]);

            int result = a / b;
            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("General exeption " + e.getMessage());
        }
        finally
        {
            System.out.println("This is the finally block");
        }
    }
}
