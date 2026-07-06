public class GreatestTernary {
    public static void main(String[] args) {
        int a = 10;
        int b = 13;
        int c = 22;

        //int res = (a > b) ? ((a > c) ? a : c) : ((b>c) ? b : c); 

        // if a is greater than b then the condition is true and it goes into the next sttement b  >  c
        // if this condition is true then b is the greatest
        //but if the first equation is false a > b then it goes to a > c and checks if a or c is greater
        
        int res = a > b && a > c ? a : b > c ? b :  c;
        System.out.println("Greatest : " + res);
    }
}
