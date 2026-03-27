package day14_chapter4.unary_operator;
 // unary operator is an operator that takes only one operand and performs an operation on it.
public class UnaryOperatorDemo1 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("a: " + a); // this will print 5
        System.out.println("++a: " + ++a); // this will print 6 because the value of a is incremented before it is printed
        System.out.println("a++: " + a++); // this will print 6 because the value of a is printed before it is incremented
        System.out.println("a: " + a); // this will print 7 because the value of a is now 7 after the previous line

        int b = 5;
        System.out.println("b: " + b); // this will print 5
        System.out.println("--b: " + --b); // this will print 4 because the value of b is decremented before it is printed
        System.out.println("b--: " + b--); // this will print 4 because the value of b is printed before it is decremented
        System.out.println("b: " + b); // this will print 3 because the value of b is now 3 after the previous line

    }

    
}
