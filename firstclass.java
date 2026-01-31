class calculator{
    public double add(double a1, double a2)
    {
        return a1+a2;
    }
    public double substract(double s1, double s2){
        return s1-s2;
    }
    public double multiplication(double m1, double m2){
        return m1*m2;
    }
    public double  divide(double d1, double d2){
        return d1/d2;
    }
    public double percentage(double p1, double p2){
        return (p1/p2)*100;
    }
}
public class firstclass {
    public static void main(String[] args) {
        double a = 5;
        double b = 10;
       calculator obj = new calculator();
       double r1 = obj.add(a,b);
       System.err.println(r1); 
        double r2 = obj.substract(a,b);
       System.err.println(r2);
        double r3 = obj.multiplication(a,b);
       System.err.println(r3);
        double r4 = obj.divide(a, b);
       System.err.println(r4);
       double r5 = obj.percentage(a, b);
       System.err.println(r5);
    }
    
}
