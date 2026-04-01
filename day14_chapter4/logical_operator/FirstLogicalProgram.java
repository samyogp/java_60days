package day14_chapter4.logical_operator;
public class FirstLogicalProgram {
  // logical operator is used to combine multiple conditions together.
   public static void main(String[] args) {
    int age = 25;
    boolean hasDrivingLicense = true;

    // Check if the person is eligible to drive
    if (age >= 18 && hasDrivingLicense) {
        System.out.println("Congratulations! You are eligible to drive.");
    } else {
        System.out.println("Sorry, you are not eligible to drive.");
    }
   }  
    
    
}
