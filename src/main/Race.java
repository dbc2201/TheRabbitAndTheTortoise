package main;

import thread.rabbit.Rabbit;

public class Race {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
    }
}
