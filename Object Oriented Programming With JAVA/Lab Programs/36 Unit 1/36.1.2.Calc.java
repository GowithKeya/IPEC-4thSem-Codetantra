package q55543;

import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("error division");
            return 0.0;
        }
        return (double) a / b;
    }
}

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.printf("Addition: %d%n", calculator.add(num1, num2));
        System.out.printf("Subtraction: %d%n", calculator.subtract(num1, num2));
        System.out.printf("Multiplication: % d%n", calculator.multiply(num1, num2));
        Double divisionResult = calculator.divide(num1, num2);
        if (divisionResult != 0.0) {
            System.out.printf("Division: %.2f% n ", divisionResult);
        }
        scanner.close();
    }

}