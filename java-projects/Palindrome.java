public class Palindrome {
    public static void main(String[] args) {
        
        String s = "madam"; // Palindrome word
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);

        sb.reverse(); // This Reverses the String

        if(s.equals(sb.toString())) // This converts StringBuilder to String class
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }    
}
