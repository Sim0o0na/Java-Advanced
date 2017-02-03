/**
 * Created by Simona Simeonova on 03-Feb-17.
 */
import java.util.Scanner;
public class stringLen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] inputArray = input.split("");
        String s = "";
        for (String n:inputArray)
            s+= n;

        if (s.length()<20)
        {
            char character = '*';
            String output = LPad(s, 20, '*');
            System.out.print(output);
        }
        else
        {
            String output = s.substring(0,20);
            System.out.print(output);
        }
    }
    public static String LPad(String str, Integer length, char car) {
        return str
                +
                String.format("%" + (length - str.length()) + "s", "")
                        .replace(" ", String.valueOf(car));
    }
}
