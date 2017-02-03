import java.util.Scanner;

/**
 * Created by Simona Simeonova on 03-Feb-17.
 */
public class countSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().toLowerCase();
        String substr = scan.nextLine();
        System.out.println(count(text, substr));
    }
    private static int count(String str, String find) {

        int index = 0, count = 0;
        do {
            index  = str.indexOf(find, index);
            if ( index == -1 ) {
                return count;
            }
            index += find.length();
            count++;
        } while( true );
    }
}
