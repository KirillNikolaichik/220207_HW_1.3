public class Task5 {
    public static void main(String[] args) {
        double x,y,z;
        double q3,q4;
        x=0;
        y=10;
        z=-12;

        if (x>=0)
           System.out.println("X в кубе равно " +  Math.pow(x,3));
        else System.out.println("X в четвертой степени равно " +  Math.pow(x,4));

        if (y>=0)
            System.out.println("Y в кубе равно " +  Math.pow(y,3));
        else System.out.println("Y в четвертой степени равно " +  Math.pow(y,4));

        if (z>=0)
            System.out.println("Z в кубе равно " +  Math.pow(z,3));
        else System.out.println("Z в четвертой степени равно " +  Math.pow(z,4));

    }
}
