public class StringsOps {
    public static void main(String[] args) {
        
        String str = new String("Hello World");
        System.out.println(str.length()); // str.length returns the length of the string

        String s = new String("ShaikAbdulMalik");
        System.out.println(s.charAt(10)); // This gives the character at the given index

        System.out.println(str.equals(s)); // This compares the two string literals and gives the answer whether they are equal or not

        System.out.println(str.equalsIgnoreCase(s)); // Since String are case-sensetive they will not be equal if the casing is wrong this helps ignore that case

        System.out.println(s.concat(str)); // This joins two different Strings togather

        System.out.println(s.substring(4)); // This gives a substring that starts from the index 4 till the end
        System.out.println(s.substring(0 , 4)); // This Gives the substring from the start index till the end index mentioned

        System.out.println(s.toUpperCase()); // String is in Upper case
        System.out.println(s.toLowerCase()); // String is in Lower case

        System.out.println(str.trim()); // This removes spaces from Start and Ending spaces 

        String s1 = new String("Banana");
        System.out.println(s1.replace('a', 'x')); // This replaces all the instances of the old char with the new char (always enclose chars in single quotes)

        System.out.println(s1.contains("ana")); // This checks whether the word contains the given string 

        System.out.println(s1.indexOf('a')); // This checks from the index of the given character, only the first occurance
        System.out.println(s1.lastIndexOf('a')); // This checks for the index of the charr only at the last occurance

        String num = "123";
        int n = Integer.parseInt(num); // This is used to convert String to int 
        System.out.println(n + 10); // Here we check that it turned into int by adding 10

        int numb = 123;
        String s2 = String.valueOf(numb); // This is used to convert int to Strings 
        System.out.println(s2 + 10); // Here the int is converted into string and when we add 10 it gives us 12310

        char[] a = s1.toCharArray(); // Here we converrt the String Banana into an array 
        System.out.println(a[0]);

        String name = "Shaik Abdul Malik";
        String [] words = name.split(" "); // so What happens here is it splits whenever it sees there is a space in the middle of the words
        // It uses regex meaning regular expressions " . | * +  ? ^ % $ () {} [] "
        for(String naming : words)
        {
            System.out.println(naming);
        }


    }
}
