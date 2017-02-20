import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Simona Simeonova on 09-Feb-17.
 */
public class FirstName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> names = Arrays.asList(scan.nextLine().split("\\s+"));
        HashSet<Character> letters = new HashSet<>();
        Stream.of(scan.nextLine().split("\\s+")).map(c->c.toLowerCase().charAt(0)).forEach(letters::add);

        Optional<String> first = names.stream()
                .filter(n->letters.contains(n.toLowerCase().charAt(0)))
                .sorted()
                .findFirst();

        if (first.isPresent())
            System.out.println(first.get());
        else
            System.out.println("No match");

    }
}
