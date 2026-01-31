public class car {
    private int speed;
    private String color;

    public car (String color){
        this.color = color;
    }

    public void speedset(int speed){
        if(speed<0){
            System.out.println("Not Possible");
        }
        else{
            System.out.println("Driving at " + speed);
        }
    }
    
}
