package lab2;

public class Task4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);

        System.out.print("x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        double width = x2 - x1;
        if (width < 0) {
            width = -width;
        }

        double height = y1 - y2;
        if (height < 0) {
            height = -height;
        }

        if (width == 0 || height == 0) {
            System.out.println("Ошибка");
            return;
        }

        double perimeter = 2 * (width + height);

        System.out.print(perimeter);

        scanner.close();
    }
}