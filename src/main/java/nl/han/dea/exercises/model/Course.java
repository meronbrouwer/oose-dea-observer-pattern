package nl.han.dea.exercises.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Course {

    Teacher teacher;
    List<Observer> students;

    public Course() {
        students = new ArrayList<Observer>();
    }

    public void startCourse() {

    }

    public void addStudent(Student attendee) {
        students.add(attendee);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void leave(Student student) {
        this.teacher.deleteObserver(student);
    }
}
