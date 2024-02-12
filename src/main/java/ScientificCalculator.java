import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double result;

        do {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square root function - √x");
            System.out.println("2. Factorial function - x!");
            System.out.println("3. Natural logarithm (base е) - ln(x)");
            System.out.println("4. Power function - x^b");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to find its square root: ");
                    double sqrtNumber = scanner.nextDouble();
                    result = squareRoot(sqrtNumber);
                    System.out.println("Square root of " + sqrtNumber + " is: " + result);
                    break;
                case 2:
                    System.out.print("Enter a number to find its factorial: ");
                    int factorialNumber = scanner.nextInt();
                    result = factorial(factorialNumber);
                    System.out.println("Factorial of " + factorialNumber + " is: " + result);
                    break;
                case 3:
                    System.out.print("Enter a number to find its natural logarithm: ");
                    double logNumber = scanner.nextDouble();
                    result = naturalLog(logNumber);
                    System.out.println("Natural logarithm of " + logNumber + " is: " + result);
                    break;
                case 4:
                    System.out.print("Enter a base number: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter an exponent: ");
                    double exponent = scanner.nextDouble();
                    result = power(base, exponent);
                    System.out.println(base + " raised to the power of " + exponent + " is: " + result);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);
        
        scanner.close();
    }

    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public static double factorial(int x) {
        if (x == 0)
            return 1;
        double result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static double naturalLog(double x) {
        return Math.log(x);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

