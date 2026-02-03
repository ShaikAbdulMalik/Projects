public class vowelCheck {
    public static void main(String[] args) {
        
        String s = "HelloWorld";
        s = s.toLowerCase();

        int vowels = 0, consonants = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vowels++;
                }
                else
                {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels are : " + vowels);
        System.out.println("Consonants are : " + consonants);
    }
}