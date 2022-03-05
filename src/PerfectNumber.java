import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PerfectNumber {
    public static String Perfect(int number)
    {
        String perfectNumber = " is a perfect number";
        String notperfectNumber = " is not a perfect number";
        int sum =0;
        for(int i = 1; i<number;i++)
        {
            if(number % i ==0)
            {
            sum += i;
            }
        }

        if(sum== number)
        {
            return perfectNumber;
        }
        else
        return notperfectNumber;
    }
    public static void main(String[] args) {
        Scanner ınput = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = ınput.nextInt();
        System.out.println(number + Perfect(number));

    }
}
