package nl.han.dea.exercises.model;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {

    private final String name;

    public Student(String name) {
        this.name = name;
    }

    private void makeNotes(String note) {
        System.out.println("Student " + name + " made note: \n" + note);
    }

    public void update(Observable o, Object arg) {
        makeNotes((String) arg);
    }
}
