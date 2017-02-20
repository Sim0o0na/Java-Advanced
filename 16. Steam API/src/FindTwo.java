import java.util.*;

/**
 * Created by Simona Simeonova on 09-Feb-17.
 */
public class FindTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        List<Integer> nums = new ArrayList<Integer>();
        for (String s : input) {
            nums.add(Integer.parseInt(s));
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (Integer num : nums) {
            if (set.size()>=2){
                break;
            }
            if(10 <= num && num <= 20){
                set.add(num);
                System.out.print(num + " ");
            }
        }
    }
}
