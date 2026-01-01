import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        while(n > 0)
        {
            n = n/10;                   // 13223-1322-132-13-1
            count = count+1;            // count = 1-2-3-4-5
        }
        System.out.println(count);
    }
    
}
