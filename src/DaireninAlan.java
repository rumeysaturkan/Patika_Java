import java.util.Scanner;

public class DaireninAlan {

    public static void main(String[] args) {
        int r,a;
        double pi = 3.14;
        double alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yarıçap değeri giriniz: ");
        r = input.nextInt();
        System.out.print("Lütfen merkez açı ölçüsünü giriniz: ");
        a = input.nextInt();
        alan = (pi*(r*r)*a)/360;

        System.out.println("Daire Diliminin alanı: " + alan);
        //Pratik Dairein Alanı ve Çevresi
       /* double pi = 3.14;
        double alan, cevre;


        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yarıçap değeri giriniz: ");
        r = input.nextInt();

        alan = pi*r*r;
        cevre = 2*pi*r;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);*/
        input.close();
    }
}
