import java.util.Scanner;
import java.lang.Math;
public class Revision_V4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < arr.length; i++)
        {
            int n = sc.nextInt();
            arr[i] = n;
        }
        System.out.println();

        // All elements of an Array:
        System.out.print("[" + " ");
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.print("]");
        System.out.println();

        // Sum of an Array :
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum = arr[i] + sum;
        }
        System.out.println();
        System.out.println("The Sum of the array is : " + sum);

        // maximum and minimum :
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("The largest element is : " + max);
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("The Smallest element is : " + min);

        // Count even and odd numbers :
        int even = 0;
        int odd = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The number of Even numbers are : "+ even);
        System.out.println("The number of Odd numbers are : "+ odd);

        // Linear Search :
        int key = 50;
        int index = -1;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                index = i;
            }
        }
        System.out.println("element found at index " + index);

        // Binary Search
        // This requires sorted array
        int key1 = 50;
        int low = 0;
        int high = arr.length-1;

        while(low <= high)
        {
            int mid = (low + high)/2;
            if(arr[mid] == key1)
            {
                System.out.println("Key found at index : " + mid);
                break;
            }
            else if(arr[mid] < key1)
            {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // last occurance of an element
        // just dont use break for this and use break for the first occurance
        int key2 = 20;
        int index1 = -1;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key2)
            {
                index1 = i;
            }
        }
        System.out.println("The last ocurrance is at index : " + index1);
    }
}
