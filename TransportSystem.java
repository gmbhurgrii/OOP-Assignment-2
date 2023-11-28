import java.io.*;
import java.util.*;

class Transport {
    // Encapsulation
    private String vehicleType;
    private int speed;

    // Constructor
    public Transport(String vehicleType, int speed) {
        this.vehicleType = vehicleType;
        this.speed = speed;
    }

    // Polymorphism - Overloading
    public void displayInfo() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Speed: " + speed + " km/h");
    }

    public void displayInfo(int distance) {
        System.out.println("Time to cover " + distance + " km: " + (distance / speed) + " hours");
    }

    // Inheritance
    static class Car extends Transport {
        public Car(String vehicleType, int speed) {
            super(vehicleType, speed);
        }

        // Method overriding
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Car Specific Info");
        }
    }

    // Abstraction
    abstract static class Vehicle {
        abstract void start();
        abstract void stop();
    }

    // Relational operators and programs
    public void relationalOperatorsExample(int num1, int num2) {
        System.out.println(num1 + " > " + num2 + ": " + (num1 > num2));
        // Add more relational operator examples
    }

    // Logical operators and programs
    public void logicalOperatorsExample(boolean condition1, boolean condition2) {
        System.out.println("Condition 1 && Condition 2: " + (condition1 && condition2));
        // Add more logical operator examples
    }

    // Assignment & Arithmetic operators and programs
    public void arithmeticOperatorsExample(int a, int b) {
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        // Add more arithmetic operator examples
    }

    // Switch program
    public void switchExample(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Option 1 selected");
                break;
            case 2:
                System.out.println("Option 2 selected");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    // If, else, if-else programs
    public void ifElseExample(int num) {
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }

    // Scanner class and methods
    public void scannerExample() {
        Scanner scanner = new Scanner(System.in);

        // nextLine() method
        System.out.print("Enter a line: ");
        String inputLine = scanner.nextLine();
        System.out.println("You entered: " + inputLine);

        // charAt method
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        System.out.println("You entered: " + inputChar);

        // Close the scanner
        scanner.close();
    }

    // Loops
    public void loopsExample(int n) {
        // For loop
        System.out.println("For Loop:");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }

        // While loop
        System.out.println("\nWhile Loop:");
        int i = 0;
        while (i < n) {
            System.out.print(i + " ");
            i++;
        }

        // Do-while loop
        System.out.println("\nDo-While Loop:");
        i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < n);
    }

    // Arrays
    public void arraysExample() {
        // One-dimensional array
        int[] numbers = {1, 2, 3, 4, 5};

        // For each loop
        System.out.println("One-dimensional array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Multidimensional array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // For each loop for multidimensional array
        System.out.println("\nMultidimensional array:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Typecasting
    public void typecastingExample() {
        // Implicit conversion
        int intValue = 10;
        double doubleValue = intValue; // Implicit conversion from int to double

        // Explicit conversion
        double doubleNumber = 15.75;
        int intNumber = (int) doubleNumber; // Explicit conversion from double to int
    }

    // Exception Handling
    public void exceptionHandlingExample() {
        try {
            // Code that may cause an exception
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Cannot divide by zero.");
        }
    }

    // Functions with "this" keyword
    public void thisKeywordExample() {
        Transport bike = new Transport("Bike", 60);
        bike.displayInfo();

        // Continuity program
        continuityProgramExample();

        // File handling
        fileHandlingExample();
    }

    // Continuity program
    private void continuityProgramExample() {
        // Code for continuity program
    }

    // File handling methods
    private void fileHandlingExample() {
        // Creating a file
        File file = new File("example.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            System.out.println("File can be read: " + file.canRead());
            System.out.println("File can be written: " + file.canWrite());
            System.out.println("File length: " + file.length() + " bytes");
            System.out.println("File absolute path: " + file.getAbsolutePath());
            System.out.println("File name: " + file.getName());

            // Deleting the file
            if (file.delete()) {
                System.out.println("File deleted: " + file.getName());
            } else {
                System.out.println("Unable to delete the file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

public class TransportSystem {
    public static void main(String[] args) {
        Transport transport = new Transport("Car", 100);
        transport.displayInfo();
        
        Transport.Car car = new Transport.Car("Sedan", 120);
        car.displayInfo();

        transport.relationalOperatorsExample(5, 8);
        transport.logicalOperatorsExample(true, false);
        transport.arithmeticOperatorsExample(10, 3);
        transport.switchExample(2);
        transport.ifElseExample(-5);
        transport.scannerExample();
        transport.loopsExample(5);
        transport.arraysExample();
        transport.typecastingExample();
        transport.exceptionHandlingExample();
        transport.thisKeywordExample();
    }
}
