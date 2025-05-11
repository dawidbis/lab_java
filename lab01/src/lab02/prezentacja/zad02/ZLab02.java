package lab02.prezentacja.zad02;

import java.util.Scanner;

public class ZLab02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 5) {
            System.out.print("Wprowadź liczbę całkowitą: ");
            String token = input.next();
            try {
                int number = Integer.parseInt(token);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("To nie jest liczba całkowita. Pomijam.");
            }
        }

        System.out.println("Suma wprowadzonych liczb: " + sum);
    }
}
