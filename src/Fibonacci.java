import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacci {

    public static int Fibonacci(int num){
        if(num<=1)
        {
            return num;
        }
        return Fibonacci(num-1)+ Fibonacci(num-2);
    }

    public static void main(String[] args) {
        Scanner ınput = new Scanner(System.in);
        System.out.println("Enter the length of the fibonacci series: ");
        int a =  ınput.nextInt()-1;
        for(int i =0; i<=a ; i++)
        {
            System.out.print(Fibonacci(i));
            System.out.print(" ");
        }
    }
}
