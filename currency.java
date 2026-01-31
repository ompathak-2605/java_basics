import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class currency {
    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);
        System.out.print("Enter the amount in rupee: ");
        float  num = output.nextFloat();
        float dollar = (num/85);
        System.out.println("The given sum of rupees in equal to "+ dollar+ "$");

    }
}
