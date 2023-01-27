package org.example.lessons;

public class TaskTwo {
    public void Second() {
        for (int a = 0; a < 6; a++) {
            for (int b = 0; b < 6; b++) {
                if (a == 0 || a == 5 || b == 0 || b == 5) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
