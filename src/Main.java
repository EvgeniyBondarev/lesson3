import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Здрасте! Это калькулятор v1.\nВведите первое целое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int num2 = scanner.nextInt();
        scanner.close();
        double num2D = num2;
        System.out.println();
        System.out.printf("Вот результаты арифметических действий:\nСложение: %d\nВычитание: %d\nУмножение: %d\nДеление: %.2f",
                (num1 + num2), (num1 - num2), (num1 * num2), (num1 / num2D));


    }
}
