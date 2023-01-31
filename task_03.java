package J_hometask_01;

import java.util.Scanner;

public class task_03 {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an operation '+','-','*','/'");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter the first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number");
        double num2 = scanner.nextDouble();
        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.err.println("The operation is invalid");
                break;
        }
    }
}
