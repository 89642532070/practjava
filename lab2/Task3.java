package lab2;

public class Task3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);


        System.out.print("Введите вещественное число ε (> 0): ");
        double epsilon = scanner.nextDouble();

        if (epsilon <= 0) {
            System.out.println("Ошибка");
            return;
        }

        double previousA = 2;
        double currentA = 2;
        int k = 1;

        while (true) {
            previousA = currentA;
            currentA = 2 + 1.0 / previousA;
            k++;

            double diff = currentA - previousA;
            if (diff < 0) {
                diff = -diff;
            }

            if (diff < epsilon) {
                break;
            }
        }

        System.out.println("K = " + k);
        System.out.println("Ak-1 = " + previousA);
        System.out.println("Ak = " + currentA);

        scanner.close();
    }
}
