import java.util.*;

/**
 * Created by Simona Simeonova on 29-Jan-17.
 */
public class StudentsRepository {
    public static boolean isDataInitialized = false;
    public static HashMap<String, HashMap<String, ArrayList<Integer>>> studentsByCourse;
    private static boolean isQueryForCoursePossible(String course){
        if(!isDataInitialized){
            OutputWriter.displayException(ExceptionMessages.DATA_NOT_INITIALIZED);
            return false;
        }

        if(!studentsByCourse.containsKey(course)){
            OutputWriter.writeMessage(ExceptionMessages.NON_EXISTENT_COURSE);
        }
        return true;
    }
    private static boolean isQueryForStudentPossible(String course, String student){
        if(!isQueryForCoursePossible(course)){
            return false;
        }
        if(!studentsByCourse.get(course).containsKey(student)){
            OutputWriter.displayException(ExceptionMessages.NON_EXISTENT_STUDENT);
            return false;
        }
        return true;
    }

    public static void getStudentMarksInCourse(String course,String student){
        if(!isQueryForStudentPossible(course,student)){
            return;
        }
        ArrayList<Integer> marks = studentsByCourse.get(course).get(student);
        OutputWriter.printStudent(student,marks);
    }
    public static void getStudentsByCourse(String course){
        if(!isQueryForCoursePossible(course)){
            return;
        }
        OutputWriter.writeMessageOnNewLine(course + ":");
        for(Map.Entry<String, ArrayList<Integer>> student : studentsByCourse.get(course).entrySet()){
            OutputWriter.printStudent(student.getKey(), student.getValue());
        }
    }

    public static void initializeData(){
        if(isDataInitialized){
            System.out.println(ExceptionMessages.DATA_ALREADY_INITIALIZED);
            return;
        }
        studentsByCourse = new HashMap<String, HashMap<String, ArrayList<Integer>>>();
        readData();
    }
    public static void readData(){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while(!input.equals("")){
            String[] tokens = input.split("\\s+");
            String course = tokens[0];
            String student = tokens[1];
            Integer mark = Integer.parseInt(tokens[2]);

            if(!studentsByCourse.containsKey(course)){
                studentsByCourse.put(course, new HashMap<>());
            }
            if(!studentsByCourse.get(course).containsKey(student)){
                studentsByCourse.get(course).put(student, new ArrayList<>());
            }
            studentsByCourse.get(course).get(student).add(mark);
            input = scan.nextLine();
        }
        isDataInitialized = true;
        OutputWriter.writeMessage("Data read.");
    }
}
