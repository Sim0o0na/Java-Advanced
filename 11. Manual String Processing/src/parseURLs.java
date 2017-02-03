import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class parseURLs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int protocolIndex = input.indexOf("://");
        String protocol = "";
        System.out.println();
        if (MoreThanOnce(input, "://") > 1) {
            System.out.println("Invalid URL");
        } else {
            if (protocolIndex > 0) {
                protocol = input.substring(0, protocolIndex);
            }
            int resourceIndex = input.indexOf("/", protocolIndex + 3);
            String server = "";
            String resource = "";
            if (resourceIndex > 0) {
                server = input.substring(protocolIndex + 3, resourceIndex);
                resource = input.substring(resourceIndex + 1);
            } else if (protocolIndex > 0) {
                server = input.substring(protocolIndex + 3);
            } else {
                server = input.substring(protocolIndex + 1);
            }

            System.out.println("Protocol = " + protocol);
            System.out.println("Server = " + server);
            System.out.println("Resources = " + resource);
        }
    }
    public static int MoreThanOnce(String full, String part)
    {
        Pattern pattern = Pattern.compile("://");
        Matcher matcher = pattern.matcher(full);
        int count = 0;
        while (matcher.find()) count++;
        return count;
    }
}
