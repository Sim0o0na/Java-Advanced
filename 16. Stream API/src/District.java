import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 09-Feb-17.
 */
public class District {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, List<Integer>> cities = new HashMap<>();

        String[] input = scan.nextLine().split("\\s+");
        Integer limit = Integer.parseInt(scan.nextLine());

        for (String s : input) {
            String[] cityArgs = s.split(":");
            String city = cityArgs[0];
            int population = Integer.parseInt(cityArgs[1]);

            cities.putIfAbsent(city, new ArrayList<>());
            cities.get(city).add(population);
        }

        cities.entrySet().stream()
                .filter(c->c.getValue().stream().mapToInt(Integer::valueOf).sum() > limit)
                .sorted((e1, e2) -> Integer.compare(e2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                                                    e1.getValue().stream().mapToInt(Integer::valueOf).sum()))
                        .forEach(e->{
                            System.out.printf("%s: ", e.getKey());
                            e.getValue().stream().sorted((n1,n2)->Integer.compare(n2, n1))
                                    .limit(5)
                                    .forEach(d->System.out.print(d + " "));
                        });
    }
}
