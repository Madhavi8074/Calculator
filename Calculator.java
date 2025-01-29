package projects;
public class Calculator {
    public static void main(String[] args) {
        double num1 = 10; 
        double num2 = 5;  
        char operation = '+'; 
        double result = 0;
        boolean validOperation = true;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
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
            System.out.println("The result of " + num1 + " " + operation + " " + num2 + " is: " + result);
        }
    }
}
