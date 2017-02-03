import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Simona Simeonova on 03-Feb-17.
 */
public class specialWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] specialWords = scan.nextLine().split(" ");
        String input = scan.nextLine();
        HashMap<String, Integer> info = new HashMap<>();
        for(String word:specialWords){
            info.put(word, 0);
        }
        for(String key:info.keySet()){
            info.put(key,moreThanOnce(input, key));
            System.out.println(key + " - " + info.get(key));
        }
    }
    private static int moreThanOnce(String full, String part)
    {
        Pattern pattern = Pattern.compile(part);
        Matcher matcher = pattern.matcher(full);
        int count = 0;
        while (matcher.find()) count++;
        return count;
    }
}
