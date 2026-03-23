public class patern {
    public static void main(String[] args) {
       int p = 2;
       int q = 0;
       try {
        int r = p/q;
       } catch (Exception e) {
        System.out.println("Somthing went wrong!"+e);// TODO: handle exception
       } 
       System.out.println(p);
       System.out.println(q);
    }
}
