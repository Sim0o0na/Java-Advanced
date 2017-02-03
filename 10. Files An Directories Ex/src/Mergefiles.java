import java.io.*;

/**
 * Created by Simona Simeonova on 30-Jan-17.
 */
public class Mergefiles {
    public static void main(String[] args) {
        String firstFile = "E:\\input.txt";
        String secondFile = "E:\\input1.txt";
        String outputFile = "E:\\output.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(firstFile));
            BufferedReader reader1 = new BufferedReader(new FileReader(secondFile));
            PrintWriter out = new PrintWriter(new FileOutputStream(outputFile))){
            String line = reader.readLine();
            String line1 = reader1.readLine();
            while(line!=null || line1!=null){
                out.write(line);
                out.write(line1);
                line = reader.readLine();
                line1 = reader1.readLine();
            }
            out.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
