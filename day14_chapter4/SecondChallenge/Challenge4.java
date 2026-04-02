package day14_chapter4.SecondChallenge;

public class Challenge4 {
    // create a program that determines if a given year is a leap year (considering conditions like divisible by 4 but not 100 unless also divisible by 400)
    public static void main(String[] args) {
        int year = 2024;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    
}
