import java.util.Scanner;

public class primr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= in.nextInt();
        isprime(n);
        
    }
    static void isprime(int a){
        if (a<=1){
            System.out.println("non prime");
        }
        for (int i = 2; i <=(a/2); i++) {
           if(a%i==0){
           System.out.println("Non-Prime");
           break;
           }
           else{
           System.out.println("Prime"); 
           break;
           }
        }
    }
}
