package Lesson3;
import java.util.ArrayList;
import java.util.List;
public class HomeWork3 {
    public static void main(String[] args) {
        //Пусть дан произвольный список целых чисел.
        //
        //1) Нужно удалить из него чётные числа
        //2) Найти минимальное значение
        //3) Найти максимальное значение
        //4) Найти среднее значение
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(8);
        numbers.add(3);

        // 1) Удаление четных чисел
        removeEvenNumbers(numbers);

        // 2) Нахождение минимального значения
        int minValue = findMinValue(numbers);

        // 3) Нахождение максимального значения
        int maxValue = findMaxValue(numbers);

        // 4) Нахождение среднего значения
        double averageValue = findAverageValue(numbers);

        System.out.println("Список после удаления четных чисел: " + numbers);
        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Максимальное значение: " + maxValue);
        System.out.println("Среднее значение: " + averageValue);
    }

    private static void removeEvenNumbers(List<Integer> numbers) {
        numbers.removeIf(n -> n % 2 == 0);
    }

    private static int findMinValue(List<Integer> numbers) {
        int minValue = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < minValue) {
                minValue = number;
            }
        }
        return minValue;
    }

    private static int findMaxValue(List<Integer> numbers) {
        int maxValue = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        return maxValue;
    }

    private static double findAverageValue(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}