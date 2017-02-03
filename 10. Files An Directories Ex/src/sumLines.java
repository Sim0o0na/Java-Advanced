//import java.io.BufferedReader;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
///**
// * Created by Simona Simeonova on 29-Jan-17.
// */
//public class sumLines{
//    public static void main(String[] args) {
//
//        String inputPath = "E:\\";
//        try(BufferedReader reader = Files.newBufferedReader(Paths.get(inputPath))){
//            String line = reader.readLine();
//            while(line!=null){
//                long sum = 0;
//                for(char ch:line.toCharArray()){
//                    sum+=ch;
//                }
//                System.out.println(sum);
//                line = reader.readLine();
//            }
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//}
