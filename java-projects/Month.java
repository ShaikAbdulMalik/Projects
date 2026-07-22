import java.util.Scanner;
public class Month {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Month : ");
        String month = sc.nextLine();
        

        switch(month){
            case "April","June","September","November":
                {
                    System.out.println("It has 30 Days...");
                    break;
                }
            case "January","March","May","July","August","October","December":
                {
                    System.out.println("It has 31 days....");
                    break;
                }
            case "Feburary":
                {
                    System.out.println("Feburary has 28 days...");
                    break;
                }
            default:
                {
                    System.out.println("Invalid Choice...");
                }
        sc.close();
        }
    }
}
