package lab1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Калькулятор Индекса Массы Тела");

        System.out.print("Введите ваш вес: ");
        double weight = scanner.nextDouble();

        System.out.print("Введите ваш рост в метрах: ");
        double height = scanner.nextDouble();

        if (weight <= 0 || height <= 0) {
            System.out.println("Ошибка");
            return;
        }

        double bmi = weight / (height * height);

        System.out.printf("Ваш Индекс Массы Тела (ИМТ) равен: %.2f\n", bmi);
        
        if (bmi < 18.5) {
            System.out.println("Категория: Недостаточная масса тела");
        } else if (bmi < 25) {
            System.out.println("Категория: Нормальная масса тела");
        } else if (bmi < 30) {
            System.out.println("Категория: Избыточная масса тела");
        } else {
            System.out.println("Категория: Ожирение");
        }

        scanner.close();
    }
}
