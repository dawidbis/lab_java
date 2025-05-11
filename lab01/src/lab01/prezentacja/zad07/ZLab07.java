package lab01.prezentacja.zad07;

import java.util.Scanner;

public class ZLab07 {
    public static void main(String args[]){
        System.out.print("Podaj temperature w stopniach celsiujsza np. 21,2: ");

        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        input.close();

        double fahrenheit = celsius * 1.8 + 32;

        System.out.println(celsius + "°C w przeliczeniu to " +  fahrenheit + "°F");
    }
}
