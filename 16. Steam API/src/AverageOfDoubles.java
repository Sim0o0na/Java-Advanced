import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Simona Simeonova on 09-Feb-17.
 */
public class AverageOfDoubles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> nums = Arrays.asList(scan.nextLine().split("\\s+"));
        OptionalDouble average = nums.stream()
                .filter(n->!n.isEmpty())
                .mapToDouble(Double::valueOf)
                .average();
        if (average.isPresent()){
            System.out.println(String.format( "%.2f", average.getAsDouble()));
        }else{
            System.out.println("No match");
        }
    }
}
