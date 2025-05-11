package lab02.prezentacja.zad07;

import java.util.Scanner;

public class ZLab07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź wyrażenie (np. 5 + 3): ");

        try {
            int a = input.nextInt();
            String operator = input.next();
            int b = input.nextInt();

            switch (operator) {
                case "+":
                    System.out.println("Wynik: " + (a + b));
                    break;
                case "-":
                    System.out.println("Wynik: " + (a - b));
                    break;
                case "*":
                    System.out.println("Wynik: " + (a * b));
                    break;
                case "/":
                    if (b == 0) throw new ArithmeticException("Dzielenie przez 0");
                    System.out.println("Wynik: " + (a / b));
                    break;
                default:
                    System.out.println("Nieznany operator: " + operator);
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Błąd danych wejściowych.");
        }
    }
}
