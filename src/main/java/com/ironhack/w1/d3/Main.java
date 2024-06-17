package com.ironhack.w1.d3;

public class Main {
    public static void main(String[] args) {
        Movie harryPotter = new Movie("Harry Potter", 120);
        Movie lotr = new Movie("Lord of the Rings", 200);
        Movie maxMax = new Movie("Mad Max");

        System.out.println(harryPotter.getTitle() + " " + harryPotter.getDuration());
        System.out.println(harryPotter);
        System.out.println(lotr);
        System.out.println(maxMax);
        System.out.println(harryPotter.IS_GOOD);
        harryPotter.play();
        lotr.play();
        Movie.displayAlert();

        HorrorMovie scream = new HorrorMovie("Scream", 80, false);
        System.out.println(scream.getTitle() + " " + scream.isReallyScary());
        scream.play();
    }
}
