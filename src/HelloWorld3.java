public class HelloWorld3 {


    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        double c, square, perim;

        square = (a*b)/2;
        c = Math.sqrt(a*a+b*b);
        perim = a+b+c;

        System.out.println("Площадь треугольника " + square);
        System.out.println("Перметр треугольника " + perim);


    }
}
