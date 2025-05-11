package lab02.prezentacja.zad06;

import java.util.Scanner;

public class ZLab06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź dwie liczby całkowite oddzielone spacją: ");
        String a = input.next();
        String b = input.next();

        try {
            int m = Integer.parseInt(a);
            int n = Integer.parseInt(b);
            if (n == 0) {
                throw new ArithmeticException("Dzielenie przez 0");
            }
            System.out.printf("%d:%d = %d r. %d\n", m, n, m / n, m % n);
        } catch (NumberFormatException e) {
            System.out.println("Podano niepoprawne liczby.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
