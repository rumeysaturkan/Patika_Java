import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlıcan;
        int armutKg, elmaKg, domatesKg, muzKg, patlıcanKg;
        double fiyat;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlıcan = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        armutKg = input.nextInt();

        System.out.print("Elma Kaç Kilo ? :");
        elmaKg = input.nextInt();

        System.out.print("Domates Kaç Kilo ? :");
        domatesKg = input.nextInt();

        System.out.print("Muz Kaç Kilo ? :");
        muzKg = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlıcanKg = input.nextInt();

        fiyat = (armutKg*armut) + (elma*elmaKg) + (domates*domatesKg) + (muz*muzKg) + (patlıcan*patlıcanKg);

        System.out.println("Toplam Tutar: " + fiyat + "TL");


    }
}
