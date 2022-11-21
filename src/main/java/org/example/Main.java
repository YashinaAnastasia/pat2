package org.example;


public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addO();
        service.addO();
        service.setNews();

        service.addO();
        service.setNews();

        service.removeO();
        service.setNews();
    }
}