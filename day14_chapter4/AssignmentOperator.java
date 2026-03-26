package day14_chapter4;
// Assignment operator Example 

public class AssignmentOperator {
    public static void main(String[] args) {
        int myInt = 9;
        int newInt = myInt;
        System.out.println("myInt: " + myInt);
        System.out.println("newInt: " + newInt);

        // 9 = myInt = newInt; // this is not valid because 9 is a constant value and cannot be assigned to a variable
    }
    
}
