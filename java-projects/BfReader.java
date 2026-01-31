import java.io.*;
public class BfReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int age = Integer.parseInt(br.readLine());
        System.out.println("The age is : "+age);
    }
}
