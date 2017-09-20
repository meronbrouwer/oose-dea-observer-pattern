package nl.han.dea.exercises;

import nl.han.dea.exercises.model.Student;
import nl.han.dea.exercises.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class CourseApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        Student piet = new Student("Piet");
        Student karel = new Student("Karel");
        Student kees = new Student("Kees");
        Student martine = new Student("Martine");

        students.add(piet);
        students.add(karel);
        students.add(kees);
        students.add(martine);

        Teacher teacher = new Teacher("Meron");

        for (Student student : students) {
            student.setTeacher(teacher);
        }

        teacher.teach();
    }
}
