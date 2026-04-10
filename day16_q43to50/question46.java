package day16_q43to50;

class TwoDPoint {
    double x, y;

    void initPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distanceTo(TwoDPoint other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class question46 {
    public static void main(String[] args) {
        TwoDPoint p1 = new TwoDPoint();
        TwoDPoint p2 = new TwoDPoint();

        p1.initPoint(0, 0);
        p2.initPoint(3, 4);

        System.out.println("Point 1: (" + p1.x + ", " + p1.y + ")");
        System.out.println("Point 2: (" + p2.x + ", " + p2.y + ")");
        System.out.printf("Distance between points: %.2f\n", p1.distanceTo(p2));
    }
}