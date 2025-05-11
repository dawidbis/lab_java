package lab02.prezentacja.zad01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZLab01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number;
        while (true) {
            System.out.print("Wprowadź liczbę typu double: ");
            try {
                number = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("To nie jest liczba typu double. Spróbuj ponownie.");
                input.next(); // usunięcie błędnego tokena
            }
        }
        System.out.println("Wprowadzona liczba: " + number);
    }
}
