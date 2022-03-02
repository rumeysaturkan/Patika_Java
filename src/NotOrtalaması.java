import javax.crypto.spec.PSource;
import java.util.Scanner;

public class NotOrtalaması {

    public static void main(String[] args) {
        int mat, fızık, tarıh, muzık, kımya;
        int not = 60;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        mat  = input.nextInt();

        System.out.print("Fizik Notu: ");
        fızık  = input.nextInt();

        System.out.print("Tarih Notu: ");
        tarıh  = input.nextInt();

        System.out.print("Müzik Notu: ");
        muzık = input.nextInt();

        System.out.print("Kimya Notu: 4");
        kımya  = input.nextInt();

        float ort = ortalama(mat,fızık,tarıh,muzık,kımya);

        System.out.println("Ortalamanız: " + ort);

        String geçme = (ort > not) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(geçme);
        input.close();
    }
    public static float ortalama(int mat, int fızık, int tarıh, int muzık, int kımya){
        float ort =  (mat + fızık + tarıh+ muzık + kımya)/6;
        return  ort;
    }


}
