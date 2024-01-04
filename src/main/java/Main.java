import week4.people.Person;
import week4.people.Student;
import week4.people.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printDepartment(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200));
        people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki", "S12345"));

        printDepartment(people);
    }
}
