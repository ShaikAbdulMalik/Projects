import java.util.Scanner;
public class SortedArr {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt(); // This 'n' defines the length of the array
       int []arr = new int[n]; // This allocates the space to the array

       for(int i = 0; i < n; i++) // This for loop is used to get the elements of the array blocks or for the spaces allocated
       {
            arr[i] = sc.nextInt();
       }

       boolean isSorted = true; // initially the array is assumed as sorted, if its not then the status is changed to false

       for(int i = 0; i < n-1; i++)
       {
            if(arr[i] > arr[i+1])
            {
                isSorted = false;
                break;
            }
       }

       if(isSorted)
       {
            System.out.println("The array is Sorted");
       }
       else
       {
            System.out.println("The array is not Sorted");
       }
    }   
}
