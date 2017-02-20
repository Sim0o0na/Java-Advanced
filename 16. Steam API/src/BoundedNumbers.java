import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Simona Simeonova on 09-Feb-17.
 */
public class BoundedNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> bounds =Stream.of(scan.nextLine().split("\\s+"))
                .map(Integer::valueOf).collect(Collectors.toList());

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::valueOf)
                .filter(x ->Collections.min(bounds) <= x && x <= Collections.max(bounds))
                .collect(Collectors.toList());

        for (Integer number : numbers) {
            System.out.print(number+" ");
        }
    }
}
