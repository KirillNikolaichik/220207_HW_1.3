public class Task7 {
    public static void main(String[] args) {
        double a;
        double b;
        double h;
        double F;

        a = 1;
        b = 5;
        h = 0.5;

        System.out.println("-------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "F");
        System.out.println("-------------------------");
        for (double x = a; x <= b; x = x + h) {
            F = Math.pow(Math.sin(x),2) - Math.cos(2*x);
            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, F);
        }
        System.out.println("-------------------------");
    }
}