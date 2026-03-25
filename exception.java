public class exception {
    public static void main(String[] args) {
        int[] arr = new int[10];
        try {
            System.out.println(arr[10]);
        
        } catch (IndexOutOfBoundsException e) {    
           System.out.println("array's last index is 9."); 
        }
        
    }
    }

