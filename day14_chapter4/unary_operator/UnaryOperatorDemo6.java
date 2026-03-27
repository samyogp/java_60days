package day14_chapter4.unary_operator;

public class UnaryOperatorDemo6 {
    // use the current value in our statement and then decrement the value by 1.
    public static void main(String[] args) {
        int a = 30;
        System.out.println(a);  // first print the current value of a which is 30
        System.out.println(a--);  // then print the current value of a which is 30 and then decrement the value of a by 1, so now a becomes 29

        int b = 40;
        System.out.println(b);  // 
        System.out.println(b--);


        // for proved we are showing a new value of a and b after decrementing the value by 1.
        System.out.println("New value of a: " + a);
        System.out.println("New value of b: " + b);
        


    }

    
}
