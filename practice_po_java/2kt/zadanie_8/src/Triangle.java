public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean check() {
        return ((a + b > c) || (b + c > a) || (a + c > b));
        }

    public int largestAngle () {
        double alpha = ((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * c));
        double betta = ((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
        double gamma = ((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * c * b));

        double a = 180 - (Math.acos(alpha) * (180 / Math.PI));
        double b = 180 - (Math.acos(betta) * (180 / Math.PI));
        double c = 180 - (Math.acos(gamma) * (180 / Math.PI));

        int maxDitForTwo = Math.max((int) a, (int) b);

        return Math.max(maxDitForTwo, (int) c);

    }
}

