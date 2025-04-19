package from.nowhere;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float firstNumber = scanner.nextFloat();
        System.out.print("Enter second number: ");
        float secondNumber = scanner.nextFloat();
        System.out.print("Enter operator ( + - * / ): ");
        String operation = scanner.next();

        float result = 0;

        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
            System.out.println(result);
        } else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
            System.out.println(result);
        } else if (operation.equals("*")) {
            result = firstNumber * secondNumber;
            System.out.println(result);
        } else if (operation.equals("/")) {
            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
                System.out.println(result);
            } else {
                System.out.println("Error: Division by zero is not allowed!");
            }
        }


        for (int i = 0; i < 1; ) {
            System.out.println("Do you want to perform the next action? Y/N ");
            String answer = scanner.next();

            if (answer.equals("n")) i = 1;
            else if (answer.equals("y")) {
                System.out.print("Enter new number: ");
                float newNumber = scanner.nextFloat();
                System.out.print("Enter new operator ( + - * / ): ");
                String newOperation = scanner.next();

                if (newOperation.equals("+")) {
                    result = result + newNumber;
                    System.out.println(result);
                } else if (newOperation.equals("-")) {
                    result = result - newNumber;
                    System.out.println(result);
                } else if (newOperation.equals("*")) {
                    result = result * newNumber;
                    System.out.println(result);
                } else if (newOperation.equals("/")) {
                    if (newNumber != 0) {
                        result = result / newNumber;
                        System.out.println(result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed!");
                    }
                }
            }
        }
    }
    }