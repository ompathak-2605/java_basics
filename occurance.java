import java.util.Scanner;

public class occurance {
    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = output.nextInt();
        System.out.print("Enter the digit to be checked: ");
        int a = output.nextInt();
        int r = 0;
        while(n>0){
            int b= n%10;
           if(b==a){
            r++;
           }
           n= n/10;
        }
        System.out.println(r);
    }
}