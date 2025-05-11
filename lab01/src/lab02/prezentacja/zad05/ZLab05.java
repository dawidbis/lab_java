package lab02.prezentacja.zad05;

import java.util.Scanner;

public class ZLab05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź liczbę całkowitą: ");

        if (input.hasNextInt()) {
            int n = input.nextInt();
            if (n != 0) {
                System.out.println("Odwrotność: " + (1.0 / n));
            } else {
                System.out.println("Nie istnieje odwrotność liczby 0.");
            }
        } else {
            String token = input.next();
            System.out.println("To nie jest liczba całkowita: " + token);
        }
    }
}
