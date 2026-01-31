
import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        factorial(n);
    }
    static void factorial(int n){
        int r=1;
        System.out.print(n+"! = ");
        for (int i = 1; i <=(n); i++) {
            System.out.print(i+" * ");
            r=r*i;
        }
        System.out.print(" = "+r);
    }
}
