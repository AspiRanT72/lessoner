package org.example.lessons;

public class TaskThree {
        public void Third() {
            for (int a = 0; a < 6; a++) {
                for (int b = 0; b < 6; b++) {
                    if (a == b) {
                        System.out.print("  ");
                    } else if (a > b) {
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
