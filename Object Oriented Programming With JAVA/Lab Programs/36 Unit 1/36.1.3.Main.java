package q21947;

import java.util.Scanner;

class Test {

    private int i;
    private int j;

    // Default constructor
    Test() {
        i = 0;
        j = 0;
    }

    // Constructor with one parameter
    Test(int i) {
        this.i = i;
        this.j = 0;
    }

    // Constructor with two parameters
    Test(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void display() {
        System.out.println("Value of i: " + i);
        System.out.println("Value of j: " + j);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Object 1 (default constructor)
        Test obj1 = new Test();
        System.out.println("Displaying values for obj1:");
        obj1.display();

        // Object 2 (one parameter)
        System.out.print("Enter a value for i: ");
        int value1 = scanner.nextInt();

        Test obj2 = new Test(value1);
        System.out.println("Displaying values for obj2:");
        obj2.display();

        // Object 3 (two parameters)
        System.out.print("Enter a value for i: ");
        int value2 = scanner.nextInt();

        System.out.print("Enter a value for j: ");
        int value3 = scanner.nextInt();

        Test obj3 = new Test(value2, value3);
        System.out.println("Displaying values for obj3:");
        obj3.display();

        scanner.close();
    }
}