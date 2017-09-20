package nl.han.dea.exercises.model;

import java.util.Observable;

public class Teacher extends Observable {

    private final String name;
    private Teachings teachings;

    public Teacher(String name) {
        this.name = name;
        this.teachings = Teachings.getInstance();
    }

    public void teach() {
        while (countObservers() > 0) {

            String wisdom = teachings.getWisdom();
            say(wisdom);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Where have all my students gone?");
    }

    private void say(String wisdom) {
        setChanged();
        notifyObservers(wisdom);
    }
}
