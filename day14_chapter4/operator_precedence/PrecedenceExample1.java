package day14_chapter4.operator_precedence;

public class PrecedenceExample1 {
    public static void main(String[] args) {
        int a = 5;

        // Post-increment (a++) happens AFTER the value is used
        int result = a++ * 2;

       
        // Step 1: use a = 5 → 5 * 2 = 10
        // Step 2: then a becomes 6

        System.out.println("Result: " + result); // 10
        System.out.println("Value of a after operation: " + a); // 6
    }
}