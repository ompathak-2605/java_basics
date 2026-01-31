public class changevalue {
    public static void main(String[] args) {
        int []arr = {4,6,82,36,3};
        swap(arr);
        for (int i = 0; i <=4;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] ary){
        ary[2]=99;
    }
}
