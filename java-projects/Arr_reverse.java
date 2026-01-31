import java.util.Scanner;
public class Arr_reverse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int []arr = new int[input];
        
        for(int a = 0; a < input; a++)
        {
            arr[a] = sc.nextInt();
        }

        for(int a = arr.length-1; a >= 0; a--)
        {
            System.out.print(arr[a]+" ");
        }
        sc.close();
    }
}
