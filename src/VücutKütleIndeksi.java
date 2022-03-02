import java.util.Scanner;

public class VücutKütleIndeksi {
    public static void main(String[] args) {
        double kilo, boy;
        double vücutKitleIndeksi;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = input.nextDouble();

        vücutKitleIndeksi = kilo/(boy*boy);

        System.out.println("Vücut kütle İndeksiniz: " + vücutKitleIndeksi);
    }
}
