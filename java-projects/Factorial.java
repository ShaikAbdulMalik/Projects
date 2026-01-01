import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int fact = 1;
        // for(int i = 1; i<=n; i++)
        // {
        //     fact = fact * i;
        // }
        // System.out.println(fact);
        
        int i = 1;
        while(n>0)
        {
            i = i * n; // if n = 5 then it will go like 5*4*3*2*1 
            n--;
        }
        System.out.println(i);
    }    
}
