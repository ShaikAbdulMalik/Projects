import java.util.Arrays;
import java.util.Scanner;

public class Revision_v3 {
    public static void main(String[] args) {
        // // All of this is for 1D arrays
        // int [] arr = {1,2,3,4}; // This is one wau of declaring arrays
        
        // int [] arr1 = new int[5]; // This is intitalization of arrays
        // // When an array is created using the new keyword its datatype contains default values
        
        // int size = 5;
        // int [] arr2 = new int[size];

        // int [] arr3 = new int[]{1,2,3,4,5}; // This is another way of adding elements into the array
        
        // // System.out.println(arr[0]); //Accessing the elements
        // arr[0] = 10; // modifying the elements
        // // System.out.println(arr[0]); 

        // // To find the length of the array
        // // System.out.println(arr1.length);

        // // Taking an input array then printing it btw its a 1D array
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the length of the array : ");
        // int n = sc.nextInt();
        // int [] arr4 = new int[n];
        // // This is for taking input for the array
        // System.out.println("Enter the elements of the array : ");
        // for(int i = 0; i <= n-1; i++)
        // {
        //     arr4[i] = sc.nextInt();
        // }
        // // This is for giving the output
        // for(int i = 0; i <= n-1; i++)
        // {
        //     System.out.print(arr4[i]);
        // }

        // // 2D arrays :
        // int [][] arr = {{1,2,3},{4,5,6}};
        // // The first curly braces if for row and the second one is for column
        // System.out.println(arr[0][1]);
        // System.out.println(arr[1][0]);
        // // Declaration and Creation togather
        // int[][] matrix = new int[][]{
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        // Jagged Arrays :
        // A jagged array is a two-dimensional array whose rows have different numbers of columns.
        // Creating a Jagged array
        // int [][] n = new int[3][]; // This creates a jagged array
        // int [][] arr1 = {
        //     {1,2,3},
        //     {4,5},
        //     {6,7,8,9}
        // };

        // Traversal :
        //  1. 1D array
//         int[]arr = new int[]{1,2,3,4};
//         for(int i = 0; i < arr.length; i++)
//         {
//             System.out.println(arr[i]);
//         }

// System.out.println();

//         // 1D array Reverse Traversal
//         for(int i = arr.length-1; i >= 0; i--)
//         {
//             System.out.println(arr[i]);
//         }

// System.out.println();
        
//         for(int n : arr)
//         {
//             System.out.println(n);
//         }

// System.out.println();

        // 2. 2D Array Traversal
        // int [][] arr = new int[][]{
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };       
        // for(int i = 0; i < arr.length; i++)
        // {
        //     for(int j = 0; j < arr.length; j++)
        //     {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

// System.out.println();

        // 3. Jagged Array Traversal :
        // int [][] arr = new int[][]{
        //     {1,2,3},
        //     {4,5},
        //     {6,7,8,9}
        // }; 
        // for(int i = 0; i < arr.length; i++)
        // {
        //     for(int j = 0; j < arr[i].length; j++)
        //     {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // 4. Linear Search :
        // int [] arr = {10,20,30,50,60};
        // int target = 50;
        // int index = -1;
        // for(int i = 0; i < arr.length; i++)
        // {
        //     if(arr[i] == target)
        //     {
        //         index = i;
        //         break;
        //     }
        // }

        // if(index == -1)
        // {
        //     System.out.println("Element not found");
        // } else {
        //     System.out.println("Element found at index : " + index);
        // }

        // Linear Search using Boolean operators
        // int [] arr = {10,20,40,50};
        // int target = 50;
        // boolean found = false;
        
        // for(int i = 0; i < arr.length; i++)
        // {
        //     if(arr[i] == target)
        //     {
        //         System.out.println("index found at : " + i);
        //         found = true;
        //     }
        // }
        // if(!found)
        // {
        //     System.out.println("Element not found....");
        // }

        // Binary Search :
        // int [] arr = {10,20,30,40,50};
        // int index = -1;
        // int left = 0;
        // int right = arr.length-1;
        // int target = 50;

        // while(left <= right)
        // {
        //     int mid = left + (right - left) / 2;
        //     if(arr[mid] == target){
        //         index = mid;
        //         break;
        //     } else if(target < arr[mid]){
        //         right = mid - 1;
        //     } else {
        //         left = mid + 1;
        //     }
        // }

        // if(index == -1)
        // {
        //     System.out.println("Element not found");
        // } else {
        //     System.out.println("Element found at index : " + index);
        // }

        // Sorting in java
        // Bubble Sort :
    }
}
