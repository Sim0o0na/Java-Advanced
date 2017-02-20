/**
 * Created by Simona Simeonova on 13-Feb-17.
 */
public class Tester {
    private static String getMismatchPath(String expectedOutput){
        int index = expectedOutput.lastIndexOf("\\");
        String directoryPath = expectedOutput.substring(0, index);
        return directoryPath + "\\mismatch.txt";
    }
    public static void compareContent(String actualOutput, String expectedOutput) {

    }
}
