import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 09-Feb-17.
 */
public class UpperStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> input = Arrays.asList(scan.nextLine().split("\\s+"));
        List<String> names = new ArrayList<>();
        for (String s : input) {
            names.add(s);
        }
        names.stream().map(s -> s.toUpperCase()).forEach(s->System.out.print(s +" "));
    }
}
