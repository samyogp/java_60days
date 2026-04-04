package day14_chapter4.operator_precedence;

public class Demo4 {
    public static void main(String[] args) {
        int result = 10 + 20 / 5 - 3;

        // Explanation:
        // Step 1: Division → 20 / 5 = 4
        // Step 2: Addition → 10 + 4 = 14
        // Step 3: Subtraction → 14 - 3 = 11

        System.out.println("Result: " + result); // 11
    }
}