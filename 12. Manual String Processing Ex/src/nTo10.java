import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 03-Feb-17.
 */
public class nTo10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        Integer baseToConvertTo = Integer.parseInt(input[0]);

        System.out.println(
                new BigInteger(input[1], 10).toString(Integer.parseInt(input[0])));
    }
}
