package prezentacja.zad08;

import java.util.Scanner;

public class ZLab08 {
    public static double sumaKwadratow(double a, double b)
    {
        return (Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static void main(String args[]){
        System.out.print("Podaj dlugosc krotszej przyprostokatnej trojkata: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        System.out.print("Podaj dlugosc dluzszej przyprostokatnej trojkata: ");
        double b = input.nextDouble();
        input.close();

        double c = Math.sqrt(sumaKwadratow(a,b));

        System.out.printf("Dlugosc przeciwprostokatnej wynosi: %,.3f", c);
    }
}
