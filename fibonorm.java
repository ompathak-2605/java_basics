
import java.util.Scanner;

public class fibonorm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a=0;
        System.out.print(a+" ");
        int b=1;
        System.out.print(b+" ");
        int c;
        for (int i = 3; i <=n; i++) {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
