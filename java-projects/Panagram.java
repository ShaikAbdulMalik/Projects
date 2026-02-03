public class Panagram {
    public static void main(String[] args) {
     
        String str = "The quick brown fox jumps over the lazy dog";
        str = str.toLowerCase();
        
        boolean[] present = new boolean[26];
        int count = 0;

        for(int i = 0; i < str.length(); i++ )
        {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z')
            {
                if(!present[ch - 'a'])
                {
                    present[ch - 'a'] = true;
                    count++; 
                }    
            }
        }
        if(count == 26)
        {
            System.out.println("Panagram");
        }
        else
        {
            System.out.println("Not a Panagram");
        }
    }
}
