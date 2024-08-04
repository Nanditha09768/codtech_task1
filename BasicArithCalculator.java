import java.util.Scanner;

public class BasicArithCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculator!");
        System.out.println("Choose an operation: +, -, *, /");
        char operation = sc.next().charAt(0);

        System.out.println("Enter the first number:");
        double number1 = sc.nextDouble();

        System.out.println("Enter the second number:");
        double number2 = sc.nextDouble();

        double res = 0;
        boolean validOperation = true;

        switch (operation) {
            case '+':
                res = number1 + number2;
                break;
            case '-':
                res = number1 - number2;
                break;
            case '*':
                res = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    res = number1 / number2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("The result is: " + res);
        }

        sc.close();
    }
}
