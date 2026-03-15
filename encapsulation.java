class human{
    private String name;
    private int age;
    private double height;
    private long number;
    
    
    public void set(String n, int a, double h, long nm){
        this.name = n;
        this.age = a;
        this.height = h;
        this.number = nm;

    }
    String getname(){
        return name;
    }
    int getage(){
        return age;
    }
    double getheignt(){
        return height;
    }
    long getnumber(){ 
        long temp = number;
        int count=0;
        while(number != 0){
            count++;
            number = number/10;
        }
        if (count != 10){
            return -1;
        } 
        else return temp; 
    }

}
public class encapsulation {
    public static void main(String[] args) {
        human obj1 = new human();
        obj1.set("Om",20,5.9,9007388063l);
        System.out.println(obj1.getname()+":"+obj1.getage()+":"+obj1.getheignt()+":"+obj1.getnumber());
    }
}
