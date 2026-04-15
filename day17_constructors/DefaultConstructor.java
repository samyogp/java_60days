package day17_constructors;


class Car {
    String color;
    int speed;

    Car() {
        color = "White";
        speed = 0;
        System.out.println("car Created ");

    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Car C = new Car();
        System.out.println(C.color); // white
        System.out.println(C.speed); // 0

    }
    
}
