package day14_chapter4.programming_challenges;

public class FirstChallenge {
    // create a program that takes two numbers and shows result of all arithmetic operations (+,-,*,/,%).
    public static void main(String[] args) {
        System.out.println("Enter the first number A: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter the second number B:");
        int b = sc.nextInt();

        System.out.println("A + B = " + (a + b));
        System.out.println("A - B = " + (a - b));
        System.out.println("A* B = " + (a * b));
        System.out.println("A / B = " + (a / b));
        System.out.println("A % B = " + (a % b));
        sc.close();

    }
    
}
