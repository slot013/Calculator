import java.util.Scanner;

public class  Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите первое число: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Ошибка: введите число!");
                sc.next();
            }
            double a = sc.nextDouble(); // считываем 1 число


            System.out.println("Введите операцию (+,-,/,*): ");
            char op = sc.next().charAt(0); // считываем только 1 символ который отвечает за операцию


            System.out.println("Введите второе число: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Ошибка: введите число!");
                sc.next();
            }
            double c = sc.nextDouble();

            double result;
            switch (op) {
                case '+':
                    result = a + c;
                    break;

                case '-':
                    result = a - c;
                    break;

                case '/':

                    if (c == 0) {
                        System.out.println("Ошибка: деление на ноль!");
                        continue;

                    }

                    result = a / c;
                    break;

                case '*':
                    result = a * c;
                    break;

                default:
                    System.out.println("Некорректная операция");
                    return;
            }
            System.out.println("Результат: " + result);
            System.out.print("Хотите продолжить? (y/n): ");
            if (sc.next().equalsIgnoreCase("n")) break;


        }
    }

}