import java.io.*;
import java.util.*;
// OOPS(object oriented Programming)

//Encapsulation : 
class Student
{
    private int age;
    public void setAge(int age)
    {
        if(age>18){
            this.age = age;
            System.out.println("age : " + age);
        }
        else
            System.out.println("Error");
    }
    public int getAge()
    {
        return age;
    }
}
// Static Block:
// class Student
// {
//     static{
//         System.out.println("Inside Static block"); 
//         // this is excuted automatically without objects or anything as it beongs to the class itself
//     }
// }

// Static methods :
// A static method belongs to the class, not to any object.
// class Student
// {
//     void study() // In order to call this i need to create an object
//     {
//         System.out.println("Studying....");
//     }
//     public static void read() // Whereas i nned  not create an object over here
//     {
//         System.out.println("Reading....");
//     }
// }

// Static variable :
// class Student 
// {
//     static String college = "Shadan";
//     int id;
// }

// Class :
// class Const
// {
//     int id; // This belongs to the object itself 
//     String college;
//     Const(int id, String college)
//     {
//         this.id = id; // we use the "this" keyword to tell the compiler that we want to use the instance variable
//         this.college = college;
//         System.out.println("In college");
//     }
// }        

// class Student
//         {
//             int id;
//             String name;
//             // Constructor : 
//             // This is a Constructor it is called whenever the obj is created for this class 
//             // you cant call it manually
//             Student(int id, String name)
//             {
//                 this.id = id;
//                 this.name = name;
//                 System.out.println("I am a Constructor");
//             }
//         }
public class Revison {

    // public static void multiplicationTable(int n)
    // {
    //     for(int i = 1; i <= 10; i++)
    //     {
    //         System.out.println(i*n);
    //     }
    // }

    // public static void greet(String name) // here the String name is called a parameter
    // {
    //     System.out.println("Hello,World!!" + name);
    // }

    //Return types:
    // public static int add(int a, int b)
    // {
    //     return a+b;
    // }

    // public static int largest(int a, int b)
    // {
    //     if(a > b)
    //     {
    //         return a;
    //     }
    //     else
    //         return b;
    // }

    // Method Overloading : 
    // public static int add(int a, int b)
    // {
    //     return a + b;
    // }
    // public static double add(double a, double b)
    // {
    //     return a + b;
    // }
    // public static int add(int a, int b, int c)
    // {
    //     return a+b+c;
    // }

    public static void main(String[] args) throws IOException{
        
        // Buffered reader :
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int num1 = Integer.parseInt(br.readLine().trim()); // this is used to trim the spaces that the user might have added
        // int num2 = Integer.parseInt(br.readLine());
        // int result = num1 + num2;
        // System.out.println("Result : " + result);

        //Bitwise Operators : 
        /*Divide the number by 2 repeatedly and store remainders.
            10 / 2 = 5 remainder 0
            5 / 2  = 2 remainder 1
            2 / 2  = 1 remainder 0
            1 / 2  = 0 remainder 1
        Read from bottom to top:
            1010 */
        // System.out.println(5 & 3); // bitwise AND
        // System.out.println(6|3); // bitwise OR
        // System.out.println(6^3); // bitwise XOR
        // System.out.println(~5); // bitwise NOT
        // System.out.println(5<<2);
        // System.out.println(10>>2);

        //Example program:
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the name : ");
        // String name = sc.nextLine();
        // System.out.println("Enter the age : ");
        // int age = sc.nextInt();
        // System.out.println("Marks in the three subjects (Math, Sci, sst) : ");
        // int math = sc.nextInt();
        // int sci = sc.nextInt();
        // int sst = sc.nextInt();
        // System.out.println("Total marks : ");
        // int total = math+sci+sst;
        // System.out.println(total);
        // System.out.println("Average marks : ");
        // int avg = total/3;
        // System.out.println(avg);
        // System.out.println("Pass or Fail : ");
        // if(avg>=35)
        // {
        //     System.out.println("Passed");
        // }
        // else
        // {
        //     System.out.println("Fail");
        // }
        // System.out.println("Eligiblilty");
        // if(age >= 18 && avg >= 60)
        // {
        //     System.out.println("eligible for college");
        // }
        // System.out.println("Bitwise: ");
        // System.out.println(math&sci);
        // System.out.println(math|sci);
        // System.out.println(math^sci);
        // System.out.println(math<<1);
        // System.out.println(math>>1);

        // Switch case : 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the first num : ");
        // int n1 = sc.nextInt();
        // System.out.println("Enter the second num : ");
        // int n2 = sc.nextInt();
        // System.out.println("Enter the Operator : ");
        // String op = sc.next();

        // switch (op) {
        //     case "+" : 
        //         System.out.println(n1+n2);
        //         break;
        //     case "-" : 
        //         System.out.println(n1-n2);
        //         break;
        //     case "*" : 
        //         System.out.println(n1*n2);
        //         break;
        //     case "/" : 
        //         System.out.println(n1/n2);
        //         break;
        //     case "%" : 
        //         System.out.println(n1%n2);
        //         break;
        
        //     default:
        //         System.out.println("enter the valid opeartor");
        //         break;
        // }

        // Loops : 
        // For loop : 
        // for(int i = 1; i <= 10; i++)
        // {
        //     System.out.println(i);
        // }

        // While loop : 
        // int i = 1;
        // while(i<=5)
        // {
        //     System.out.println(i);
        //     i++; // if i dont add this it will become an infinite loop 
        // }

        // Do while loop:
        // int i = 5;
        // do{ // this loop will run the program atleast once then it will check the condition 
        //     System.out.println(i);
        // }while(i<=5);

        // break : 
        // for(int i = 1; i <= 5; i++)
        // {
        //     if(i == 3)
        //         break;
        //     System.out.println(i);
        // }

        // Continue : 
        // for(int i = 1; i <= 5; i++)
        // {
        //     if(i==3)
        //         continue;
        //     System.out.println(i);
        // }

        // Even numbers : 
        // for(int i = 2; i <= 20; i += 2)
        // {
        //     System.out.println(i);
        // }

        // odd numbers : 
        // for(int i = 1; i <= 19; i += 2)
        // System.out.println(i);
        // }

        // patterns : 
        // for(int i = 1; i <= 5; i++)
        // {
        //     for(int j = 1; j <= i; j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Methods :
        // A method is a block of reusable code that performs a specific task.
        // it cannot be called in the main method 
        // it can be called in the public class and another class
        // example at the top
        // greet();
        // parameters: Parameters allow you to send data into a method.
        //greet("Malik"); // The value given to name is called as argument 
        //multiplicationTable(2);
        //System.out.println(add(10,2));
        // System.out.println(largest(13,2));

        // Method overloading : 
        // Multiple methods with the same name but different parameters.
        // add(10,2);
        // add(12.2, 22.5);
        // add(10,22,33);
        // How does it know which method to excecute 
        // thats by the given argument
        // it checks the argument and decides which method to use

        // Arrays :
        // n array stores multiple values of the same data type in a single variable.
        // Method 1:
        // int[] arr = new int[5]; // creates an array of size 5
        // System.out.println(arr[2]);
        // System.out.println(arr.length);
        // // Method 2:
        // int[] arr2 = {10,20,30,40,50};
        // System.out.println(arr2[2]); // Automatically sets the size
        // System.out.println(arr2.length);
        // // An array always starts from zero 
        // // Updating elements
        // arr[1] = 12;
        // System.out.println(arr[1]);
        // // traveling or traversing an array
        // for(int i = 0; i < arr2.length; i++)
        // {
        //     System.out.println(arr2[i]);
        // }
        // Scanner sc = new Scanner(System.in);
        // int [] a = new int[3];
        // for(int i = 0; i < a.length; i++)
        // {
        //     a[i] = sc.nextInt();
        // }
        // for(int i = 0; i < a.length; i++)
        // {
        //     System.out.println(a[i]);
        // }

        // Largest Array:
        // Scanner sc = new Scanner(System.in);
        // int[] arr = new int[5];
        // for(int i = 0; i < arr.length; i++)
        // {
        //     arr[i] = sc.nextInt();
        // }
        // Second Largest:
        // int largest = arr[0];
        // int Slarge = arr[0];
        // for(int i = 1; i < arr.length; i++)
        // {
        //     if (arr[i] > largest) {
        //         Slarge = largest;
        //         largest = arr[i];
        //     }
        //     else if (arr[i] > Slarge) {
        //         Slarge = arr[i];
        //     }
        // }
        // System.out.println("Largest = " + largest);
        // System.out.println("Second Largest = " + Slarge);

        // Linear Search:
        // Scanner sc = new Scanner(System.in);
        // int[] arr = new int[5];

        // for(int i = 0; i< arr.length; i++)
        // {
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println("Enter the key : ");
        // int key = sc.nextInt();

        // boolean found = false;
        // for(int i = 0; i < arr.length; i++)
        // {
        //     if(key == arr[i])
        //     {
        //         found = true;
        //         System.out.println("Found key at : " + i);
        //         break;
        //     }
        // }
        // if(!found)
        // {
        //     System.out.println("Element not found");
        // }

        // Reversing an array
        // here we're gonna use two pointers 
        // int[] arr = {1,2,3};
        // int left = 0;
        // int right = arr.length - 1;

        // while (left < right) 
        //     {
    // swap
            // int temp = arr[left];
            // arr[left] = arr[right];
            // arr[right] = temp;
            // left++;
            // right--;
            // }
            // for(int i = 0; i<arr.length; i++)
            // {
            //     System.out.print(arr[i] + " ");
            // }
            // int[] arr = {10,20,30,40};
            // for(int i = 0; i < arr.length; i++)
            // {
            //     System.out.println(arr[i]);
            // }
            // int left = 0;
            // int right = arr.length-1;
            // int temp = arr[left];
            // arr[left] = arr[right];
            // arr[right] = temp; 
            // left++;
            // right--;
            // for(int i = 0; i < arr.length; i++)
            // {
            //     System.out.print(arr[i] + " ");
            // }

        // Enhanced for-each Loops
        // int[] arr = {10,20,30};
        // for(int num : arr) 
        // {
        //     System.out.println(num);
        // }
        // This loop is used to print all the elemnets of the array and we cant use its index to solve the answers

        // 2D Arrays
        // Declaration of 2D Arrays 
        // int [][] arr = new int[3][3]; // Row x Columns ( _ x |)
        // Initialization of 2D arrays
        // int [][] arr2 = {{1 ,2, 3},{4, 5, 6},{7, 8, 9}};
        //Accessing elements
        // System.out.println(arr2[1][2]);
        // Taking input
        // Scanner sc = new Scanner(System.in);
        // for(int i = 0; i < arr.length; i++)
        // {
        //     for(int j = 0; j < arr[i].length; j++)
        //     {
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // Printing the output
        // for(int i = 0; i < arr.length; i++)
        // {
        //     for(int j = 0; j < arr[i].length; j++)
        //     {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // Sum of all elements in a matrix
        // int [][] arr = {{1,2,3},{4,5,6}};
        // int sum = 0;
        // for(int i = 0; i < arr.length; i++)
        // {
        //     for(int j = 0; j < arr[i].length; j++)
        //     {
        //         sum += arr[i][j];
        //     }
        // }
        // System.out.println(sum);
        // Largest element 
        // int[][] arr = {{1,2,3},{7,4,5}};
        // int largest = arr[0][0];
        // for(int i = 0; i < arr.length; i++)
        // {
        //     for(int j = 0; j < arr[i].length; j++)
        //     {
        //         if(arr[i][j] > largest)
        //         {
        //             largest = arr[i][j];
        //         }
        //     }
        // }
        // System.out.println("Largest : " + largest);
        // Smallest Elements : 
        // int [][] arr = {{1,2,3},{3,4,5}};
        // int smallest = arr[0][0];
        // for(int i = 0; i< arr.length;i++)
        // {
        //     for(int j = 0; j < arr[i].length;j++)
        //     {
        //         if(smallest>arr[i][j])
        //         {
        //             smallest = arr[i][j];
        //         }
        //     }
        // }
        // System.out.println("Smallest : " + smallest);
        // Principle Diagonal line
        // int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        // for(int i = 0; i< arr.length;i++)
        // {
        //     for(int j = 0; j < arr[i].length;j++)
        //     {
        //         if(i == j)
        //         {
        //             System.out.print(arr[i][j] + " ");
        //         }
        //     }
        // }
        // Jagged Arrays : are arrays where the elements of each row dont have the same number of elements
        // meaning the rows and columns dont match
        // int [][] arr = new int[3][];
        // arr[0] = new int[2];
        // arr[0] = new int[3];
        // arr[0] = new int[1];
        // This is one way the other ways is : 
        // int [][] arr = {{1,2,3},{4,5},{6}};
        // for(int i = 0; i< arr.length;i++)
        // {
        //     for(int j = 0; j < arr[i].length;j++)
        //     {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // // Strings : 
        // String name = "Malik";
        // String name0 = "Malik";
        // String name1 = new String("Fahad");
        // String name2 = new String("Fahad");
        // System.out.println(name);
        // System.out.println(name1);
        // // == operator compares the addresses not the String, for comparing we use equals()
        // System.out.println(name == name1); //false
        // // Because one is created and Stored in Stringpool and other in heap
        // System.out.println(name1 == name2); // false
        // // this is beacause both have different addresses and does not match
        // System.out.println(name == name0); // True
        // // This is because "Malik" exists in the stringpool so it does not create another malik rather reuses it and name and name0 both point towards it
        // System.out.println(name1.equals(name2));// True
        // This is because this is used in String to compare the values in the String Fahad = Fahad
        // hence true
        
        // String immutability
        // String s = "Java";
        // s = s + " Program";
        // System.out.println(s);
        // Here what happens is String are immutable meaning once created its content cannot be changed so when we do this what happends is java creates two String 1-> "Java" and the other one 2 -> "Java program"
        // And s just points to the new String created
        // String s1 = "Hello";
        // s1 = s1.concat(" World");
        // System.out.println(s1);

        // // Keywords for Strings :
        // String name = "Malik";
        // // Length
        // System.out.println(name.length()); // length() keyword prints the length of the string
        // // charAt(index)
        // System.out.println(name.charAt(2)); // charAt(index) returns the character at the specified index
        // System.out.println(name.charAt(name.length()-1));
        // // SubString
        // System.out.println(name.substring(1)); // Starts printing from the first index till the last 
        // System.out.println(name.substring(1,3)); // here it starts printing from 1st indexxx till the 3rd one
        // //indexOf()
        // System.out.println(name.indexOf('i')); // Prints the index of the char or string mentioned
        // // lastIndexOf()
        // System.out.println(name.lastIndexOf('a')); // Shows the last occurencce of the character 'a'
        // // contains
        // System.out.println(name.contains("lik"));
        // // startsWith()
        // System.out.println(name.startsWith("ja"));// prints whether the String Starts with the given String or Character or not
        // // endsWith()
        // System.out.println(name.endsWith("lik")); //same but with ends with
        // System.out.println("Apple".compareToIgnoreCase("APPLE"));
        // System.out.println("Apple".equalsIgnoreCase("APPLE"));
        // System.out.println("Java".replace('J','k'));
        // System.out.println(name.isEmpty()); // cheecks whether the String is empty or not
        // System.out.println(name.isBlank()); // same but with white spaces
        // System.out.println(name.intern());

        // StringBuilder and StringBuffer
        // String Builder : a mutable sequence of characters.
        // StringBuilder sb = new StringBuilder();
        // // OR
        // StringBuilder sb1 = new StringBuilder("Malik");
        // // Append
        // System.out.println(sb1.append(" Bhai"));
        // // insert
        // System.out.println(sb1.insert(1, 'b')); // inserts a character at the specified index
        // // delete
        // System.out.println(sb1.delete(3, 4));
        // // deleteCharAt()
        // System.out.println(sb1.deleteCharAt(2));
        // // reverse
        // System.out.println(sb1.reverse());
        // // Capacity
        // System.out.println(sb1.capacity());
        // //toString()
        // String s = sb1.toString();
        // System.out.println(s);

        // StringBuffer
        //Everything learned in StringBuilder also applies to StringBuffer but its used for threads 

        // OOPS(object oriented Programming)
        
        // Object :
        // Student s1 = new Student(101,"malik");
        // System.out.println(s1.id);
        // System.out.println(s1.name);
        // Student s2 = new Student(102,"Abdul");
        // System.out.println(s2.id);
        // System.out.println(s2.name);
        // Const c = new Const(1, "Shadan");
        // System.out.println(c.id);
        // System.out.println(c.college);

        // Static Keyword :
        // Student s1 = new Student();
        // s1.id = 101;
        // System.out.println(s1.id);
        // System.out.println(s1.college); 
        // This is common variable for all the objects
        // The college variable is shared by all the objeects and does not need to be created each time 

        // Static Method : 
        // Student s = new Student();
        // s.study();
        // Student.read(); 
        // // This does not require object creation...
        // To invoke this we need className + Static MethodName
        // Student s = new Student(); // We need to use this to load the class and then the static block would run
        // System.out.println("Inside main method");

        // Encapsulation : 
        //Encapsulation is the process of wrapping data (variables) and methods into a single unit (class) while restricting direct access to the data.
        // Encapsulation add a layer of security so that nobody can change the values of the variables easily
        Student s = new Student();
        s.setAge(20); // success 
        // Always access the private variable by creating a method as Setter and the using getters to access or change the values
        // This is use to set the age but how do you print or use it
        // Thats done by getAge
        // s.setAge(17); // Error
        System.out.println(s.getAge());



    }
}