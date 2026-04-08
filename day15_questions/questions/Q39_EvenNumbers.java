package day15_questions.questions;
// Q39: Display all even numbers from 1 to 500 [BIM 2015]
public class Q39_EvenNumbers {
     public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 500:");
        for (int i = 2; i <= 500; i = i + 2) {
            System.out.print(i + " ");
        }
    }
}
