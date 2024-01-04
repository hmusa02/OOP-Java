package week4.people;

import java.util.ArrayList;
import java.util.List;

public class ExtendedStudent extends ExtendedPerson {
    private String studentId;
    private List<Double> grades;

    public ExtendedStudent(String name, String address, int age, String country, String studentId) {
        super(name, address, age, country);
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        if (grade >= 0.0 && grade <= 100.0) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade. Grade must be between 0.0 and 100.0.");
        }
    }
}
