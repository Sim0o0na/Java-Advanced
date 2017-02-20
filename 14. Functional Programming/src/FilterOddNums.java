
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 07-Feb-17.
 */
public class FilterOddNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s*,\\s*");
        List<Integer> numbers = new ArrayList<>();
        for(String num:input){
            numbers.add(Integer.parseInt(num));
        }
        StringBuilder sb = new StringBuilder();
        numbers.removeIf(n -> n % 2 != 0);
        for (Integer s : numbers) {
            sb.append(s);
            sb.append(", ");
        }
        sb.delete(sb.length() -2, sb.length());
        System.out.println(sb);

        numbers.sort((a, b) -> a.compareTo(b));

        System.out.println(String.join(", ", sb));
    }
}
