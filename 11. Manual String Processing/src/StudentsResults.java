import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Simona Simeonova on 01-Feb-17.
 */
public class StudentsResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, TreeMap<String, Double>> info = new TreeMap<>();
        Integer n = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i<n;i++){
            String[] line = scan.nextLine().split("\\s*-\\s*");
            Double[] grades = new Double[3];
            String[] gradesSplitted = line[1].split("\\s*,\\s*");
            Double sum = 0.0;
            for(int m = 0; m<3;m++){
                grades[m] = Double.parseDouble(gradesSplitted[m]);
                sum+=grades[m];
            }
            TreeMap<String, Double> map = new TreeMap<>();
            map.put("JAdv", grades[0]);
            map.put("JavaOOP", grades[1]);
            map.put("AdvOOP", grades[2]);
            map.put("Average", sum/3);
            info.put(line[0],map);
        }
        System.out.println(String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|", "Name", "JAdv", "JavaOOP","AdvOOP", "Average"));
        for(String key:info.keySet()){
            System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|", key, info.get(key).get("JAdv"),
                    info.get(key).get("JavaOOP"), info.get(key).get("AdvOOP"),
                    info.get(key).get("Average")).replace('.',','));
        }
    }
}
