package lab02.prezentacja.zad03;

import java.util.Scanner;

public class ZLab03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, count = 0;

        while (count < 5) {
            System.out.print("Wprowadź liczbę całkowitą: ");
            if (input.hasNextInt()) {
                int number = input.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Niepoprawna wartość. Pomijam.");
                input.next(); // ignorujemy błędny token
            }
        }

        System.out.println("Suma: " + sum);
    }
}
