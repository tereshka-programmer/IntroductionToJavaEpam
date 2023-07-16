package BasicsOfOOP.Four;

import java.util.Arrays;
import java.util.Scanner;

public class DragonTreasureApp {
    private static final int MAX_TREASURES = 100;
    private Treasure[] treasures;
    private int treasureCount;

    public DragonTreasureApp() {
        treasures = new Treasure[MAX_TREASURES];
        treasureCount = 0;
    }

    public void addTreasure(Treasure treasure) {
        if (treasureCount < MAX_TREASURES) {
            treasures[treasureCount] = treasure;
            treasureCount++;
            System.out.println("Сокровище добавлено в пещеру дракона.");
        } else {
            System.out.println("Пещера дракона полна, невозможно добавить новое сокровище.");
        }
    }

    public void viewTreasures() {
        if (treasureCount == 0) {
            System.out.println("Пещера дракона пуста, сокровища отсутствуют.");
        } else {
            System.out.println("Список сокровищ в пещере дракона:");
            for (int i = 0; i < treasureCount; i++) {
                System.out.println(treasures[i]);
            }
        }
    }

    public void findMostValuableTreasure() {
        if (treasureCount == 0) {
            System.out.println("Пещера дракона пуста, сокровища отсутствуют.");
        } else {
            Arrays.sort(treasures, 0, treasureCount); // Сортируем сокровища по возрастанию стоимости
            Treasure mostValuableTreasure = treasures[treasureCount - 1];
            System.out.println("Самое дорогое сокровище в пещере дракона:\n" + mostValuableTreasure);
        }
    }

    public void findTreasuresByPrice(double maxPrice) {
        if (treasureCount == 0) {
            System.out.println("Пещера дракона пуста, сокровища отсутствуют.");
        } else {
            System.out.println("Сокровища в пещере дракона на сумму до " + maxPrice + ":");
            for (int i = 0; i < treasureCount; i++) {
                if (treasures[i].getPrice() <= maxPrice) {
                    System.out.println(treasures[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DragonTreasureApp treasureApp = new DragonTreasureApp();

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Добавить сокровище");
            System.out.println("2. Просмотреть все сокровища");
            System.out.println("3. Найти самое дорогое сокровище");
            System.out.println("4. Найти сокровища на заданную сумму");
            System.out.println("0. Выход");

            System.out.print("Выберите пункт меню: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после ввода числа

            switch (choice) {
                case 1:
                    System.out.print("Введите название сокровища: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите стоимость сокровища: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Очистка буфера после ввода числа

                    Treasure treasure = new Treasure(name, price);
                    treasureApp.addTreasure(treasure);
                    break;
                case 2:
                    treasureApp.viewTreasures();
                    break;
                case 3:
                    treasureApp.findMostValuableTreasure();
                    break;
                case 4:
                    System.out.print("Введите максимальную сумму для поиска сокровищ: ");
                    double maxPrice = scanner.nextDouble();
                    scanner.nextLine(); // Очистка буфера после ввода числа

                    treasureApp.findTreasuresByPrice(maxPrice);
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
                    break;
            }

            System.out.println();
        }
    }
}
