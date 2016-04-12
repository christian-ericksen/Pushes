import java.util.*;

/**
 * Created by Christian on 1/28/16.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("test");
        arrayList.add("ant");

        LinkedList<String> linkedList = new LinkedList<>();

      //List.sort(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println(arrayList.contains("Hello!"));

        System.out.println(arrayList.indexOf("test"));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());

        String[] stringArray = new String[]{"one","two"};

        List<String> stringArrayList = Arrays.asList(stringArray);
        System.out.println(stringArrayList);


    }
}
