import java.util.ArrayList;
import java.util.Arrays;
public class arraylist1 {
    public static void main(String[] args) {
        //declearing arraylist,and adding element

        ArrayList <Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(16);

        System.out.println(arr);

        // getting element

        int el = arr.get(4);
        System.out.println("4th element is "+el);

        // changing element
        arr.set(3, 90);
         System.out.println(arr);

        // adding element at any index

        arr.add(0, 89);
         System.out.println(arr);

        // delete element

        arr.remove(0);
        System.out.println(arr);

        //size

        int size = arr.size();
        System.out.println(size);
    }
}
