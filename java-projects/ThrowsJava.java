import java.io.*;
public class ThrowsJava {
    static void readfile() throws IOException
    {
        FileReader fr = new FileReader("data.txt");
        System.out.println("File Opened");
    }
    public static void main(String[] args) {
            
            try{
                readfile();
            }
            catch(IOException e)
            {
                System.out.println("Exception found " + e.getMessage());
            }
        }
    }

