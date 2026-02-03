import java.util.Arrays;

public class Anagram {
 static boolean isAnagram(String s1, String s2)
{
    if(s1.length() != s2.length())
    {
        return false;
    }
    char[] a1 = s1.toCharArray();
    Arrays.sort(a1);
    s1 = new String(a1);// COnverting to String after Sorting
    
    char[] a2 = s2.toCharArray();
    Arrays.sort(a2);
    s2 = new String(a2);

    return s1.equals(s2);
}
    public static void main(String[] args) {
        
        // String s1 = "Listen";
        // String s2 = "Silent";

        // s1 = s1.toLowerCase();
        // s2 = s2.toLowerCase();

        // if(s1.length() != s2.length())
        // {
        //     System.out.println("Not An anagram");
        // }

        // char[] a1 = s1.toCharArray(); // toCharArray convert all the characters in the String into elements of the array
        // char[] a2 = s2.toCharArray();

        // Arrays.sort(a1);
        // Arrays.sort(a2);

        // if(Arrays.equals(a1, a2))
        // {
        //     System.out.println("Anagram");
        // }
        // else
        // {
        //     System.out.println("Not an Anagram");
        // }

        String s1 = "Listen";
        String s2 = "Silent";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(isAnagram(s1, s2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
