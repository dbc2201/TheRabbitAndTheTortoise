package main;

import thread.rabbit.Rabbit;
import thread.tortoise.Tortoise;

public class Race {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tortoise tortoise= new Tortoise();
        rabbit.getRabbit().start();
        tortoise.getTortoise().start();

    }
}
