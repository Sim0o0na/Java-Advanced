import java.io.*;

/**
 * Created by Simona Simeonova on 30-Jan-17.
 */
public class allCapitals {
    public static void main(String[] args) {
        String inputPath = "E:\\input.txt";
        String outputPath = "E:\\output.txt";


        try(BufferedReader in = new BufferedReader(new FileReader(inputPath));
            PrintWriter out = new PrintWriter(new FileOutputStream(outputPath))){
            int ch;
            while ((ch = in.read()) != -1)
            {
                if (Character.isLowerCase(ch))
                {
                    ch=Character.toUpperCase(ch);// convert assign variable
                }
                out.write(ch);
            }

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
