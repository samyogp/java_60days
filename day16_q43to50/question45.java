package day16_q43to50;

class Rectangle45 {
    double length;
    double breadth;

    Rectangle45(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}

class question45 {
    public static void main(String[] args) {
        Rectangle45 r1 = new Rectangle45(10, 5);
        Rectangle45 r2 = new Rectangle45(7, 3);
        Rectangle45 r3 = new Rectangle45(15, 4);

        Rectangle45 greatest = r1;
        if (r2.length > greatest.length) greatest = r2;
        if (r3.length > greatest.length) greatest = r3;

        System.out.println("Rectangle with greatest length:");
        System.out.println("Length = " + greatest.length + ", Breadth = " + greatest.breadth);
        System.out.println("Area = " + greatest.area());
    }
}