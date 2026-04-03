package day14_chapter4.SecondChallenge;

import java.util.Scanner;
import java.time.Year; // To get current year automatically

public class Challenge5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
System.out.println("Welcome to age calculator!");
System.out.println("Please enter your age:");
int age = input.nextInt();

if (age < 0) {
    System.out.println("Invalid age entered!");
} else if (age >= 65) {
    System.out.println("You are a senior citizen");
} else if (age >= 20) {
    System.out.println("You are an adult");
} else if (age >= 13) {
    System.out.println("You are a teenager");
} else {
    System.out.println("You are a child");
}

input.close();
}
}