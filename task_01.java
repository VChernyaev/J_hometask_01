package J_hometask_01;

/*
 * сумма чисел от 1 до n и факториал от 1 до n
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        try {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Input a number n: ");
            int number = iScanner.nextInt();
            int b = number;
            int sum = (b * (b + 1)) / 2; // сумма чисел от 1 до n
            System.out.printf("The sum of numbers from 1 to n is %s !\n", sum);
            int fact = 1;
            for (int i = 2; i <= number; i++) { // факториал числа от 1 до n
                fact = fact * i;
                // System.out.printf("The factorial of numbers from 1 to n is %s !", fact);
            }

            System.out.printf("The factorial of numbers from 1 to n is %s !", fact);
            iScanner.close();

        } catch (InputMismatchException e) {
            System.out.println("It is not a number!");
        }
    }

}
