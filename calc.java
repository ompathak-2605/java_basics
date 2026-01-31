import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = input.nextInt();
    System.out.print("Enter second number: ");

    int num2 = input.nextInt();
    System.out.print("Enter the operation to perform: ");
    char s = input.next().trim().charAt(0);
    int r=0;
    if(s=='+'){
        r = num1+num2;
    }
     else if(s=='-'){
        r = num1-num2;
    }
     else if(s=='*'){
        r = num1*num2;
    }
     else if(s=='/'){
        r = num1/num2;
    }
    else{
        
        System.out.println("invalid operation");
    }
    if(r!=0){
    System.out.println("The r is:"+r);
    }
}

}
