import java.util.Scanner;

public class geometry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num1 =0f;
    }
    static void circle(float r){
        System.out.print("What calculation do you want to perform:");
        Scanner in = new Scanner(System.in);
        String s = in.nextString();
        float a = 2*2.141*r;
        System.out.println("Area of circle is:"+a );
    }
    static void areatriangle(float b,float h){
        float a = (b*h)/2;
        System.out.println("Area of triangle is:"+a );
    }
    static void arearectangle(float l,float b){
        float a = (b*l);
        System.out.println("Area of rectangle is:"+a );
    }
    static void areaparallelogram(float b,float h){
        float a = (b*h);
        System.out.println("Area of paralelogram is:"+a );
    }
    static void arearhombus(float b,float h){
        float a = (b*h)/2;
        System.out.println("Area of rombus is:"+a );
    }
}
