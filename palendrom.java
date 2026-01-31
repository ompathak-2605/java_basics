import java.util.Scanner;


public class palendrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       int res = paleo(n);
       if(n==res){
        System.out.println("Palendrom");
       }
       else{
        System.out.println("Non palendrom");
       }
}
static int paleo(int n)
    int r=0;
    int p=0;
    while(n!=0){
        p=n%10;
        r=r*10+p;
        n=n/10;
    }
    return r;
}
}
