package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Service implements ServiceI {
    Scanner in;
    String news;
    List<Observer> observers;


    public Service() {
        this.in = new Scanner(System.in);
        this.observers = new ArrayList();
    }

    public void setNews() {
        System.out.print("Введите новость: ");
        String news = in.nextLine();
        this.notifyO(news);
    }

    public void addO() {
        Observer observer = new Observer();
        System.out.print("Введите имя нового пользователя\n");
        observer.name = in.nextLine();
        observers.add(observer);
    }

    public void removeO() {
        Iterator<Observer> observerIterator = observers.iterator();
        System.out.print("Введите имя удаляемого пользователя пользователя: ");
        String named = in.nextLine();
        while(observerIterator.hasNext()){
            Observer nextObserver = observerIterator.next();
            if (nextObserver.name.equals(named)) {
                observerIterator.remove();
            }
        }

    }

    public void notifyO(String news) {
        Iterator<Observer> observerIterator = observers.iterator();
        while(observerIterator.hasNext()){
            Observer nextObserver = observerIterator.next();
            nextObserver.update(news);
        }

    }
}

