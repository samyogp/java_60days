package day15_questions.questions;

// Q31: Print only palindrome numbers from an array
class Q31_PalindromeFromArray {
    static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        int[] arr = {121, 33, 45, 1221, 500, 8, 1001};
        System.out.println("Palindrome numbers from array:");
        for (int i = 0; i < arr.length; i++) {
            if (isPalindrome(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}