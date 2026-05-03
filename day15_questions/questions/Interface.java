package day15_questions.questions;

interface Shape {
  void area();
  void perimeter();
}
class Circle implements Shape {
  double r;
  Circle(double r) { this.r = r; }
  public void area() {
    System.out.println("Area = " + 3.14*r*r);
  }
  public void perimeter() {
    System.out.println("Perimeter = " + 2*3.14*r);
  }
}
public class Interface {
  public static void main(String[] args) {
    Shape s = new Circle(5);
    s.area();
    s.perimeter();
  }
}