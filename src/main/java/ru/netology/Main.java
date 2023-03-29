package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int arrSize = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrSize; i++) {
            list.add(random.nextInt(maxValue));
        }
        System.out.print("Вот случайный список: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> filterList = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        for (int num : filterList) {
            System.out.print(num + " ");
        }
        System.out.println();
        logger.log("Завершаем программу");


    }
}