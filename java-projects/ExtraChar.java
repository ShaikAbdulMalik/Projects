import java.util.Arrays;
public class ExtraChar {
    public static void main(String[] args) {
     
        String s1 = "abcd";
        String s2 = "abcde";

        char a1[] = s1.toCharArray();
        char a2[] = s2.toCharArray();
        
        Arrays.sort(a1); 
        Arrays.sort(a2);
        
        int n = s1.length();
        int i;
        for( i = 0; i < n; i++)
        {
            if(a1[i] != a2[i])
            {
                System.out.println(a2[i]);
            }
        }
        System.out.println(a2[i]);
    }
}
