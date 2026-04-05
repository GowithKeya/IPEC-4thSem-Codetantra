package q79655;

import java.util.Scanner;

class Calculator {
    int addfunc(int a, int b) {
        return a + b;
    }

    double addfunc(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calc = new Calculator();

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();

        int intSum = calc.addfunc(num1, num2);
        System.out.println(intSum);

        double doubleSum = calc.addfunc(num3, num4);
        System.out.printf("%.2f%n", doubleSum);

        scanner.close();
    }
}