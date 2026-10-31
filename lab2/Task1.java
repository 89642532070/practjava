package lab2;

public class Task1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);

        System.out.print("Число A: ");
        int a = scanner.nextInt();

        System.out.print("Число B: ");
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Ошибка");
            return;
        }

        int count = 0;
        for (int i = b; i >= a; i--) {
            System.out.print(i + " ");
            count++;
        }

        System.out.println();
        System.out.println("Количество чисел: " + count);

        scanner.close();
    }


}
