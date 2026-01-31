import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        float p = input.nextFloat();
        System.out.print("Enter the given time in year: ");
        int t = input.nextInt();
        System.out.print("Enter the rate of interest: ");
        float r = input.nextFloat();

        double si= (p*r*t)/100;

        System.out.print("The simple interest is "+si);

    }
}
