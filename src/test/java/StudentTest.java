import org.junit.Test;
import java.util.ArrayList;


public class StudentTest {
    ArrayList<Integer> grades = new ArrayList<>();
    @Test
    public void student() {
        student student1 = new student(1, "John", grades);
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(80);
        student1.addGrade(70);
        student1.addGrade(60);
        student1.getGradeAverage();
    }

}
