package day14_chapter4.operator_precedence;


public class Demo5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Ternary operator has lower precedence than arithmetic
        int result = (a > b) ? a + 5 : b + 5;

        // Explanation:
        // Condition: a > b → false
        // So execute: b + 5 → 20 + 5 = 25

        System.out.println("Result: " + result); // 25
    }
}
