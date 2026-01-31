public class array {
    public static void main(String[] args) {
        int p=1;
        int j=0;
        int arr[]=new int[10];
        for(int i=0;i<=9;i++){
            arr[i]=p;
            p=p+2;
        }
        while(j<10) {
            System.err.println(arr[j]);
            j++;
        }
        
    }
}
