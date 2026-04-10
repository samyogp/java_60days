package day16_q43to50;

class Rectangle47 {
    double length, breadth;

    Rectangle47(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double computeArea() {
        return length * breadth;
    }

    void displayArea() {
        System.out.println("Length: " + length + ", Breadth: " + breadth + ", Area: " + computeArea());
    }
}

class Q47_RectangleLargerArea {
    public static void main(String[] args) {
        Rectangle47 r1 = new Rectangle47(8, 5);
        Rectangle47 r2 = new Rectangle47(6, 7);

        r1.displayArea();
        r2.displayArea();

        if (r1.computeArea() > r2.computeArea()) {
            System.out.println("Rectangle 1 has larger area: " + r1.computeArea());
        } else {
            System.out.println("Rectangle 2 has larger area: " + r2.computeArea());
        }
    }
}