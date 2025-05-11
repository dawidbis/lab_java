package lab01.prezentacja.zad01;

public class ZLab01 {
    public static void main(String[] args) {
        System.out.println("Kody liczbowe i odpowiadajace im znaki:");

        for(int i=48;i<=124;i++)
        {
            System.out.println("Kod " + i + " odpowiada znakowi: " + (char)i);
        }
    }
}
