# GLA University, Mathura

## BCSC 1002 Object-Oriented Programming

### Multithreading Lab Task

---
**TASK**
- Create a definition class for a "thread" in java, 
by implementing the `java.lang.Runnable` interface.
This thread will be the thread for a "rabbit".
- Create a definition class for a "thread" in java,
by extending the `java.lang.Thread` class.
This class will be the thread for a "tortoise".

- The Rabbit thread and the Tortoise thread will have a race.
(they will start executing concurrently)

- The Rabbit thread is a fast one, and it executes
with a step of 1.5s (it sleeps for 1.5s).

- The Tortoise thread is a slow one, and it executes with a step of 3.0s
(it sleeps for 3.0s).

- The milestones in the race are as follows
    - The Start Line
    - The Cool River
    - The Mountain Hill
    - The Big Oak Tree
    - The Finish Line

- The thread that you create for either of the participant of the race
shall execute in 5 steps for each of the milestones; and don't forget to make them pause (sleep).      