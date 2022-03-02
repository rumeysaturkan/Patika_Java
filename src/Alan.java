import java.util.Scanner;

public class Alan {
    public static void main(String[] args) {
        int cevre, a, b, c;
        double alan, u;
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin ilk kenarının değeri: ");
        a = input.nextInt();

        System.out.print("Üçgenin ikinci kenarının değeri: ");
        b = input.nextInt();

        System.out.print("Üçgenin üçüncü kenarının değeri: ");
        c = input.nextInt();

        cevre = a+b+c;
        u = cevre/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alana: " + alan);

        input.close();
        // Hipotenus bulma
        /*int ılkKenar, ıkıncıKenar;
        double hıpotenus;

        Scanner input = new Scanner(System.in);
        System.out.println("Dik üçgenin ilk kenarının değerini giriniz: ");
        ılkKenar = input.nextInt();

        System.out.println("Dik üçgenin ikinci kenarının değerini giriniz: ");
        ıkıncıKenar = input.nextInt();

        hıpotenus = Math.sqrt(ılkKenar*ılkKenar + ıkıncıKenar*ıkıncıKenar);

        System.out.println("Hipotenüs Değeri: " + hıpotenus);*/
    }

}
