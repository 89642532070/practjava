package lab2;

public class Task2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);


        System.out.print("Введите вещественное число X (|X| < 1): ");
        double x = scanner.nextDouble();

        System.out.print("Введите целое число N (> 0): ");
        int n = scanner.nextInt();

        if (x >= 1 || x <= -1) {
            System.out.println("Ошибка");
            return;
        }

        if (n <= 0) {
            System.out.println("Ошибка");
            return;
        }

        double sum = 0;
        double xPower = x;
        double xSquared = x * x;
        int sign = 1;

        for (int k = 0; k <= n; k++) {
            int denominator = 2 * k + 1;
            sum += sign * xPower / denominator;

            xPower *= xSquared;
            sign *= -1;
        }

        System.out.println(sum);

        scanner.close();
    }
}