public class evendigit {
    public static void main(String[] args) {
        int[] num = {12,33,4,212,4444,234,45,76,2312,767};
        digit(num);
    }
    public static void digit(int[] arr){
        int p=0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            while(temp>0){
            p++;
            temp=temp/10;
            }
            if(p%2==0){
                System.out.println(i + " has even digits");
            }
            p=0;
        }
    }
}
