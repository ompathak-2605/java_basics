public class overloding {
    public static void main(String[] args) {
        fun(4);
        // fun("OM");
        // fun(4,8);
        
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String s){
        System.out.println(s);
    }
    static void fun(int a,int b){
        System.out.println(a+ " "+ b);
    }
}
