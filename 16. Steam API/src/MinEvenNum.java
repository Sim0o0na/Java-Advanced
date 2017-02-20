import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 09-Feb-17.
 */
public class MinEvenNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Optional<Double> min = Arrays.stream(scan.nextLine().split("\\s+"))
                .filter(n -> !n.isEmpty())
                .map(Double::valueOf)
                .filter(n -> n % 2 == 0)
                .min(Double::compare);
        if(min.isPresent()){
            System.out.println(String.format("%.2f", min.get()));
        }else{
            System.out.println("No match");
        }
    }
}
