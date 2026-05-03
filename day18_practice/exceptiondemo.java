package day18_practice;

public class exceptiondemo {
    public static void main(String[] args) {
    try {
      int a = 10, b = 0;
      int c = a / b;           // throws ArithmeticException
      System.out.println(c);
    }
    catch(ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }
    finally {
      System.out.println("Finally always executes");
    }
  }
}