import java.util.Scanner;

public class largernumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two numbere");
        int num1= input.nextInt();
        int num2= input.nextInt();
        if(num1>num2)System.out.println(num1+"is the greatest");
        else System.out.println(num2+"is the greatest");

    }
}
