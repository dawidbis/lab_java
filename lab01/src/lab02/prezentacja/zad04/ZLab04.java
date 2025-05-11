package lab02.prezentacja.zad04;

import java.util.Scanner;

public class ZLab04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź liczbę całkowitą: ");
        String s = input.next();

        try {
            int n = Integer.parseInt(s);
            if (n == 0) {
                throw new ArithmeticException("Nie istnieje odwrotność liczby 0.");
            }
            double result = 1.0 / n;
            System.out.println("Odwrotność: " + result);
        } catch (NumberFormatException e) {
            System.out.println("To nie jest liczba całkowita: " + s);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
