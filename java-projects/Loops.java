public class Loops {
    public static void main(String[] args) {
        char alph = 'A';
        for(alph = 'A'; alph <= 'Z'; alph++)
        {
            System.out.print(alph + " ");
        }
// Reverse Alphabets
        char chars = 'Z';
        System.out.println();
        while (chars >= 'A') {
            System.out.print(chars + " ");
            chars--;
        }
        System.out.println();
// Small Alphabets
        for(char Salph = 'a'; Salph <= 'z'; Salph++)
        {
            System.out.print(Salph + " ");
        }
// Small reverse Alphabets
        char Schars = 'z';
        System.out.println();
        while (Schars >= 'a') {
            System.out.print(Schars + " ");
            Schars--;
        }

    }
}
