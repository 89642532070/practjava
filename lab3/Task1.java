package lab3;

public class Task1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);


        System.out.print("N: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = n - 1; i >= 0; i -= 2) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}