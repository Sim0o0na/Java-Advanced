import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 09-Feb-17.
 */
public class SumIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = new ArrayList<>();
        String[] input = scan.readLine().split("\\s+");
        Integer sum = 0;
        for (String s : input) {
            if(isNumeric(s)){
                nums.add(Integer.parseInt(s));
                sum+=Integer.parseInt(s);
            }
        }
        if(nums.size()>0){
            System.out.println(sum);
        }else{
            System.out.println("No match");
        }


    }
    public static boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
}
