import java.io.*;

/**
 * Created by Simona Simeonova on 30-Jan-17.
 */
public class CountCharacterTypes {
    public static void main(String[] args) {
        String inputPath = "E:\\input.txt";
        String outputPath = "E:\\output.txt";

        int vowelsCount = 0;
        int consonantsCount = 0;
        int punctuationMarksCount = 0;
        try(BufferedReader in = new BufferedReader(new FileReader(inputPath));
            PrintWriter out = new PrintWriter(new FileOutputStream(outputPath))){
            int ch;
            while ((ch = in.read()) != -1)
            {
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                   vowelsCount++;
                }
                if (ch=='!' || ch==',' || ch=='.' || ch=='?')
                {
                    punctuationMarksCount++;
                }
                if(ch==' '){
                    continue;
                }else{
                    consonantsCount++;
                }
            }
            out.write("Vowels: " + vowelsCount);
            out.write("Consonants: " + consonantsCount);
            out.write("Punctuation: " + punctuationMarksCount);

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
