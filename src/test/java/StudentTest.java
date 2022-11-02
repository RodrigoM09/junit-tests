import java.util.ArrayList;

public class StudentTest {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public StudentTest(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }
    //returns the student's id
    public long getId() {
        return id;
    }

    //returns the student's name
    public String getName() {
        return name;
    }

    //adds the given grade to the grades list
    public void addGrade(Integer grade) {
        grades.add(grade);
    }

    //returns the list of grades
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    //returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public StudentTest() {
    }

}
