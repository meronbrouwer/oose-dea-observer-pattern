package nl.han.dea.exercises.model;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class Student implements Observer {

    private Teacher teacher;
    private final String name;
    private int numberOfNotes;

    public Student(String name) {

        this.name = name;
    }

    public void setTeacher(Teacher teacher) {
        numberOfNotes = (new Random()).nextInt(20);

        this.teacher = teacher;
        teacher.addObserver(this);
    }

    private void makeNotes(String note) {
        System.out.println("Student " + name + " made note: \n" + note);

        numberOfNotes--;

        if (numberOfNotes == 0) {
            teacher.deleteObserver(this);
            System.out.println("Student " + name + " has left the classroom");
        }
    }

    public void update(Observable o, Object arg) {
        makeNotes((String) arg);
    }
}
