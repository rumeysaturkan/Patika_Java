import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner ınput = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int a  = ınput.nextInt();
        System.out.print(IsPalindrom(a));

    }

    public static String IsPalindrom(int a)
    {
        String palidrom = "It is a palindrom number";
        String notPalindrom =  "It is not a palindrom number";
        String s = String.valueOf(a);
        String b = "";
        if(s.length()==1)
        {
        return palidrom;
        }
        else
        {
            for(int i = 0; i<s.length();i++)
            {
                b += "" + s.substring(i,i+1) ;
            }
            if(b.equals(s)){
                return palidrom;
            }
            else
                return notPalindrom;
        }

    }

}
