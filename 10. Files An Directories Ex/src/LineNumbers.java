import java.io.*;

/**
 * Created by Simona Simeonova on 30-Jan-17.
 */
public class LineNumbers {
    public static void main(String[] args) {
        String inputPath = "E:\\input.txt";
        String outputPath = "E:\\output.txt";

        int lineCounter = 0;
        try(BufferedReader in = new BufferedReader(new FileReader(inputPath));
            PrintWriter out = new PrintWriter(new FileOutputStream(outputPath))){
            String line = in.readLine();
            while(line!=null){
                lineCounter++;
                line = lineCounter+". "+ line;
                out.write(line);
                line = in.readLine();
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
