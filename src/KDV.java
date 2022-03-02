import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("KDV'siz Fiyat: ");
        double para = input.nextDouble();

        if (para<0)
        {
            System.out.println("Lütfen geçerli değer giriniz.");
        }
        double KdvOranı, KdvFiyat, KdvTutarı ;
        KdvOranı = (para>=1000) ? 0.08 : 0.18;
        KdvFiyat = para+(para*KdvOranı);
        System.out.println("KDV'li Fiyat: " + KdvFiyat);

        KdvTutarı = KdvFiyat - para;
        System.out.println("KDV Tutarı: " + KdvTutarı );


        input.close();
        }

    }

