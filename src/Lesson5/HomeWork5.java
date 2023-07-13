package Lesson5;
import java.util.*;
public class HomeWork5 {
        public static void main(String[] args) {
            // Создаем HashMap для хранения записей в телефонной книге
            HashMap<String, List<String>> phoneBook = new HashMap<>();

            // Добавляем записи в телефонную книгу
            addContact(phoneBook, "Иванов", "1234567890");
            addContact(phoneBook, "Петров", "9876543210");
            addContact(phoneBook, "Иванов", "5555555555");
            addContact(phoneBook, "Сидоров", "1111111111");
            addContact(phoneBook, "Петров", "2222222222");
            addContact(phoneBook, "Сидоров", "3333333333");

            // Сортируем записи по убыванию числа телефонов
            List<Map.Entry<String, List<String>>> sortedContacts = new ArrayList<>(phoneBook.entrySet());
            Collections.sort(sortedContacts, (a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()));

            // Выводим отсортированные записи
            for (Map.Entry<String, List<String>> entry : sortedContacts) {
                String name = entry.getKey();
                List<String> phoneNumbers = entry.getValue();
                System.out.println(name + ": " + phoneNumbers);
            }
        }

        private static void addContact(HashMap<String, List<String>> phoneBook, String name, String phoneNumber) {
            // Проверяем, есть ли уже запись для данного имени в телефонной книге
            if (phoneBook.containsKey(name)) {
                // Если запись уже есть, добавляем новый номер телефона в список
                List<String> phoneNumbers = phoneBook.get(name);
                phoneNumbers.add(phoneNumber);
            } else {
                // Если записи еще нет, создаем новый список и добавляем номер телефона
                List<String> phoneNumbers = new ArrayList<>();
                phoneNumbers.add(phoneNumber);
                phoneBook.put(name, phoneNumbers);
            }
        }
    }
}