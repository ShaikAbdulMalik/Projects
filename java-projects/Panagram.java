public class Panagram {
    public static void main(String[] args) {
     
        String str = "The quick brown fox jumps over the lazy dog";
        str = str.toLowerCase();
        boolean isPresent = true;

        for(char ch = 'a'; ch <= 'z'; ch++)
        {
            if(!str.contains(String.valueOf(ch)))
            {
                isPresent = false;
                break;
            }
        }
        if(isPresent)
        {
            System.out.println("It is a Panagram");
        }
        else
        {
            System.out.println("It is not a panagram");
        }
    }        
}
