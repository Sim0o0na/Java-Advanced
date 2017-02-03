import java.io.*;

/**
 * Created by Simona Simeonova on 30-Jan-17.
 */
public class sumBytes{
    public static void main(String[] args) {
        String inputPath = "E:\\input.txt";

        long sum = 0;
        try(BufferedReader in = new BufferedReader(new FileReader(inputPath))){
            int oneByte = in.read();
            while((oneByte = in.read())>=0) {
                int ascii = (int) oneByte;
                sum += ascii;
            }
            System.out.println(sum);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
