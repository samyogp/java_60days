package day14_chapter4.unary_operator;

public class UnaryOperatorDemo5 {
   // use the current value in our statement and then increment the value by 1.
   public static void main(String[] args) {
    int a = 5;
    System.out.println(a);
    System.out.println(a++);


    int b = 10;
    System.out.println(b);
    System.out.println(b++);


    // for proved we are showing a new value of a and b after incrementing the value by 1.
    System.out.println("Incremented  value of a: " + a);
    System.out.println("Incremented value of b: " + b);

   } 
    
}
