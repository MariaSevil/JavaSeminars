package Lesson1;
import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int n = 5; // Здесь можно указать нужное значение для n
        int triangularNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangularNumber += i;
        }
        System.out.println("Треугольное число для n = " + n + " равно " + triangularNumber);

        int factorial = calculateFactorial(n);
        System.out.println("Факториал для n = " + n + " равен " + factorial);
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void task2() {
        System.out.println("Простые числа от 1 до 1000:");
        for (int number = 1; number <= 1000; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите первое число:");
        double num1 = scanner.nextDouble();
        System.out.print(" Введите оператор( +,-,*,/):");
        char operator = scanner.next().charAt(0);
        System.out.print(" Введите второе число:");
        double num2 = scanner.nextDouble();

        double result = 0;
        switch (operator) {
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
                result = num1 / num2;
                break;
            default:
                System.out.println(" Некорректный оператор");
                return;
        }
        System.out.println(" Результат:" + result);
        scanner.close();
    }
}
