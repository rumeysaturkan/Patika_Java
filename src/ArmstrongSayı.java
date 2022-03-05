import java.util.Scanner;

public class ArmstrongSayı {

    public static String armstronSayı(int a){
        int length;
        String s ;
        String armstrong = "This number is a armstrong number";
        String notArmstrong = "This number is not a armstrong number";
        length = String.valueOf(a).length();
        s = String.valueOf(a);
        Integer[] rakamlar = new Integer[length];
        int b =0;
        for(int i = 0; i < s.length();i++){
            rakamlar[b] = Integer.valueOf(s.substring(i,i+1));
            b++;
        }
        int sum = 0 ;
        for(int i = 0 ; i < rakamlar.length; i++){
             sum+= Math.pow(rakamlar[i],length);
        }
        if(sum == a){
            return armstrong;
        }
        else
            return notArmstrong;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int a =  input.nextInt();
        System.out.println(armstronSayı(a));

    }
}
