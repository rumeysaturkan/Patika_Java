import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner ınput = new Scanner(System.in);
        System.out.print("please enter how many values to enter: ");
        int a = ınput.nextInt();
        Integer[] array = new Integer[a];
        for(int i = 0; i<a ; i++)
        {

            System.out.print( "number " + (i+1) +": ");
            array[i] = ınput.nextInt();
        }
        int max = array[0];
        int min = array[1];
        for (int i =0; i<array.length; i++){
            if(array[i]>max){
                max= array[i];
            }
            if(array[i]<min){
                min = array[i];
            }

        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

}

