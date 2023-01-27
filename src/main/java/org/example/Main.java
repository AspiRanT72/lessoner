package org.example;

import org.example.lessons.TaskOne;
import org.example.lessons.TaskTwo;
import org.example.lessons.TaskThree;
public class Main {
    public static void main(String[] args) {
        TaskOne taskOne = new TaskOne();
        TaskTwo taskTwo = new TaskTwo();
        TaskThree taskThree = new TaskThree();

        taskOne.First();
        taskTwo.Second();
        taskThree.Third();
    }
}