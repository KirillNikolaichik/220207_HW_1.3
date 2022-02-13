package by.tut.epam.kir.task3;

import java.util.Scanner;

public class Task3 {
    int a = 0;
    int b = 0;
    double square;
    double perim;

    public void input() {
        Scanner sc = new Scanner(System.in);
        while ((a == 0) || (b == 0)) {
            try {
                System.out.println("Введите длину катета 1");
                a = Integer.parseInt(sc.next());
                System.out.println("Введите длину катета 2");
                b = Integer.parseInt(sc.next());

            } catch (NumberFormatException e) {
                System.out.println("ошибка чтения числа с клавиатуры");
            }
        }
    }

    public void calculateSquarePerim() {
        double c;
        square = (a * b) / 2;
        c = Math.sqrt(a * a + b * b);
        perim = a + b + c;
    }

    public void outputData() {
        System.out.println("Площадь треугольника " + square);
        System.out.println("Перметр треугольника " + perim);
    }
}
