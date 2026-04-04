package day14_chapter4.operator_precedence;

public class Demo2 {
    public static void main(String[] args) {
        int a = 5;

        // Pre-increment (++a) happens BEFORE the value is used
        int result = ++a + 2;

        // Explanation:
        // Step 1: a becomes 6
        // Step 2: 6 + 2 = 8

        System.out.println("Result: " + result); // 8
        System.out.println("Value of a: " + a); // 6
    }
}