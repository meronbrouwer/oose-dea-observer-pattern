package nl.han.dea.exercises.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Course {

    Teacher teacher;
    List<Observer> attendees;

    public Course() {
        attendees = new ArrayList<Observer>();
    }

    public void startCourse() {
        if (teacher == null) {
            System.out.println("No Teacher available to teach.");
        }
        for (Observer attendee : attendees) {
            teacher.addObserver(attendee);
        }
        teacher.teach();
    }

    public void addAttendee(Observer attendee) {
        this.attendees.add(attendee);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void leave(Observer attendee) {
        this.teacher.deleteObserver(attendee);
    }
}
