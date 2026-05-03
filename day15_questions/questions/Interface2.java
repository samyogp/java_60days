package day15_questions.questions;
// write a program to implement interface in java 

interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Drawable r = new Rectangle();
        Drawable c = new Circle();
        r.draw();
        c.draw();
    }
}
