package Lesson6;
import java.util.*;
public class HomeWork6 {

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//
//2 - Объем ЖД
//
//3 - Операционная система
//
//4 - Цвет …
//
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


        public static void main(String[] args) {
            // Создаем множество ноутбуков
            Set<Laptop> laptops = new HashSet<>();
            laptops.add(new Laptop("HP", 8, 256, "Windows 10", "Silver"));
            laptops.add(new Laptop("Dell", 16, 512, "Windows 10", "Black"));
            laptops.add(new Laptop("Apple", 16, 512, "macOS", "Space Gray"));
            laptops.add(new Laptop("Lenovo", 8, 128, "Windows 10", "Black"));

            // Запускаем метод фильтрации
            filterLaptops(laptops);
        }

        public static void filterLaptops(Set<Laptop> laptops) {
            // Создаем Map для хранения критериев фильтрации
            Map<Integer, Object> filters = new HashMap<>();
            Scanner scanner = new Scanner(System.in);

            // Запрашиваем критерии фильтрации
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("Введите номер критерия (или 0 для завершения):");

            int criteria = scanner.nextInt();
            while (criteria != 0) {
                System.out.println("Введите минимальное значение для критерия " + criteria + ":");
                Object value = scanner.next();

                filters.put(criteria, value);

                System.out.println("Введите номер критерия (или 0 для завершения):");
                criteria = scanner.nextInt();
            }

            // Фильтруем ноутбуки и выводим результаты
            for (Laptop laptop : laptops) {
                if (isLaptopMatchingFilters(laptop, filters)) {
                    System.out.println(laptop.getBrand());
                }
            }
        }

        private static boolean isLaptopMatchingFilters(Laptop laptop, Map<Integer, Object> filters) {
            for (Map.Entry<Integer, Object> entry : filters.entrySet()) {
                int criteria = entry.getKey();
                Object value = entry.getValue();

                switch (criteria) {
                    case 1:
                        if (laptop.getRam() < (int) value) {
                            return false;
                        }
                        break;
                    case 2:
                        if (laptop.getStorage() < (int) value) {
                            return false;
                        }
                        break;
                    case 3:
                        if (!laptop.getOperatingSystem().equals(value)) {
                            return false;
                        }
                        break;
                    case 4:
                        if (!laptop.getColor().equals(value)) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }

            return true;
        }
    }

    class Laptop {
        private String brand;
        private int ram;
        private int storage;
        private String operatingSystem;
        private String color;

        public Laptop(String brand, int ram, int storage, String operatingSystem, String color) {
            this.brand = brand;
            this.ram = ram;
            this.storage = storage;
            this.operatingSystem = operatingSystem;
            this.color = color;
        }

        public String getBrand() {
            return brand;
        }

        public int getRam() {
            return ram;
        }

        public int getStorage() {
            return storage;
        }

        public String getOperatingSystem() {
            return operatingSystem;
        }

        public String getColor() {
            return color;
        }
    }