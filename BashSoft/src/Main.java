/**
 * Created by Simona Simeonova on 27-Jan-17.
 */
public class Main {
    public static void main(String[] args) {
        StudentsRepository.initializeData();
        StudentsRepository.getStudentsByCourse("Unity");
    }
}
