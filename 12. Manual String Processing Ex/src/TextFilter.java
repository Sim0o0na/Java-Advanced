import java.util.Scanner;

/**
 * Created by Simona Simeonova on 03-Feb-17.
 */
public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] banList = scan.nextLine().split("\\s*,\\s*");
        String text = scan.nextLine();

        for(String word:banList){
            text.replaceAll(word, "*");
        }
        System.out.println(text);
    }
}
