public class Multiple {
   public static void main(String[] args) {
    try{
        int a = 10/0;
        System.out.println(a);    
        
        int arr[] = new int[5];
        arr[10] = 50;
    } catch(ArithmeticException e){
        System.out.println("Arithmetic exception handled " + e.getMessage());
    } 
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array out of bounds exception handdles " + e.getMessage());
    } 
    catch(Exception e){
        System.out.println("All Exceptions Handled" + e.getMessage());
    } 
    finally{
        System.out.println("In Finally Block");
    }

   } 
}
