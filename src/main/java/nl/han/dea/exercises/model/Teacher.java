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
        while (true) {

            String wisdowm = teachings.getWisdom();
            setChanged();
            notifyObservers(wisdowm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
