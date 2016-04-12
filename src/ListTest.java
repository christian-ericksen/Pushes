import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Christian on 1/28/16.
 */
public class ListTest {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();


        for (int j=1; j<=10; j++){
            linkedList.add(j);

        }

        for (int i=5; i<=15; i++) {
            if (linkedList.contains(i)) {
                linkedList.remove(new Integer(i));

            }
        }

        System.out.println(linkedList.size());

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("name","Drew");

        System.out.println(hashMap.get("name"));

        hashMap.remove("name");

        System.out.println(hashMap.get("name"));

}
}
