import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);
        System.out.println("Hello, If you want to convert rupee to doller enter R and If you want to convert doller to rupee enter D");
        String change = output.toString();
        if(change == "R"){
        System.out.println("We are here to convert rupee to doller...");
        System.out.print("Enter the amount in rupee: ");
        float  num = output.nextFloat();
        float dollar = (num/85);
        System.out.println("The given sum of rupees in equal to "+ dollar+ "$");
}
        if(change == "D"){
        System.out.println("We are here to convert doller to rupee...");
        System.out.print("Enter the amount in doller: ");
        float  num = output.nextFloat();
        float rupee = (num*85);
        System.out.println("The given sum of dollar in equal to "+ rupee );
}
        

    }
}
