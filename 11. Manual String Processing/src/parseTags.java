import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class parseTags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<String> output = new ArrayList<String>();
        int a = 0;
        int b = 0;
        while (a!=-1){
            a = input.indexOf("<upcase>");
            b = input.indexOf("</upcase>");
            if (a != -1)
            {
                String text = input.substring(0, a);
                output.add(text);
                String text1 = input.substring(a + 8, b).toUpperCase();
                output.add(text1);
                input = input.substring(b + 9, input.length());

            }
            else
            {
                String text = input.substring(0, input.length());
                output.add(text);
            }
        }
        output.stream().forEach(System.out::print);
    }
}
