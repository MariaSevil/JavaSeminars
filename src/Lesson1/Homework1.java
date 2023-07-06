package Lesson1;

public class Homework1 {
    public static void main(String[] args) {
        task1();
        task2();
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
}