
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class listframework {
    public static void main(String[] args) {
        List<Integer> item = new ArrayList<>();
        for (int i = 1; i <=10; i++) {
            item.add(i);
        }
        for (Object elem : item) {
            System.out.println(elem);
        }
        Map<Integer, String> credential = new HashMap<>();

        credential.put(1,"Om");
        credential.put(2,"kumar");
        credential.put(3,"harsh");
        credential.put(4,"barun");
        credential.put(5,"pratyush");

        System.out.println(credential.get(3));

        



    }
}
