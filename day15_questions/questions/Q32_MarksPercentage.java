package day15_questions.questions;


    
//Q32: Take marks of 5 subjects in array and generate percentage

class Q32_MarksPercentage {
    public static void main(String[] args) {
        int[] marks = {78, 85, 90, 72, 68};
        int total = 0;
        int fullMarks = 5 * 100;

        System.out.println("Subject-wise marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
            total = total + marks[i];
        }

        double percentage = (total * 100.0) / fullMarks;
        System.out.println("Total marks: " + total + "/" + fullMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
    }
}
