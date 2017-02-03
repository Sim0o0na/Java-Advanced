import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Simona Simeonova on 03-Feb-17.
 */
public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        char[] input = scan.readLine().toCharArray();
        String output = "";
        for(int i = input.length-1; i>=0; i--){
            output+=input[i];
        }
        System.out.print(output);
    }
}
