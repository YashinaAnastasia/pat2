package org.example;

public class Observer implements ObserverI {
    String name;

    public Observer() {
    }

    public void update(String news) {
        System.out.println(name + " узнал новость: " + news);
    }
}
