import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedRead {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        String input = br.readLine();
        int n = Integer.parseInt(input); // Converts String -> Int

        System.out.println("Age is : " + n);

        System.out.println(input.toString());
    }
}
