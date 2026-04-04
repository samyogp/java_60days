package day14_chapter4.operator_precedence;

public class Demo3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // Relational operators (>, <) are evaluated before logical AND (&&)
        boolean result = x < y && y > 15;

        // Explanation:
        // x < y → true
        // y > 15 → true
        // true && true → true

        System.out.println("Result: " + result); // true
    }
}