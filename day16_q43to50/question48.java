package day16_q43to50;

class Number48 {
    int x, y, z;

    Number48(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    int getMax() {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }
}

class Q48_NumberDemo {
    public static void main(String[] args) {
        Number48 num = new Number48(25, 67, 43);
        System.out.println("x = " + num.x + ", y = " + num.y + ", z = " + num.z);
        System.out.println("Largest number: " + num.getMax());
    }
}