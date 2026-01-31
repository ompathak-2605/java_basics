import java.util.Scanner;

public class grade{
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter Marks");
      int marks = in.nextInt();  
      grd(marks);
    }
    static void grd(int m){
        if (m>100){
            System.out.println("Invalid input");
        }
        else if (m>90){
            System.out.println("Grade : AA");
        }
        else if (m>80){
            System.out.println("Grade : AB");
        }
        else if (m>70){
            System.out.println("Grade : BB");
        }
        else if (m>60){
            System.out.println("Grade : BC");
        }
        else if (m>50){
            System.out.println("Grade : CD");
        }
        else if (m>40){
            System.out.println("Grade : DD");
        }
         else if (m>40){
            System.out.println("Grade : DD");
        }
        else {
            System.out.println("Fail");
        }
    }
}

