public class enhancedfor {
    public static void enfor(int[] arr){
        System.out.println("Enhanced for loop used for integer array");
        for(int num:arr){
            System.out.println("Num ="+num);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        enfor(arr);
    }
}
