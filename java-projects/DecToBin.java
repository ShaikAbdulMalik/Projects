public class DecToBin {
    public static void main(String[] args) {
     
        int n = 46;
        StringBuilder sb = new StringBuilder();

        while(n>0)
        {
            if((n%2)==0)
            {
                sb.append('0');
            }
            else
            {
                sb.append('1');
            }

            n = n/2;
        }
        sb.reverse();
        System.out.println(sb.toString());
    }
}
