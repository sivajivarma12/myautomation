import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class collectionsList {
    public static void main(String[] args) {

     /*
     * 1.List values will be stored based on index
     * 2.values can be duplicate
     * 3.if we add any values in existing index then new value will be added
     * at index and current value will be moved to next index.
     * 4.null values are allowed.
     * 5.Arraylist and linkedlist both are same only differenace is implementation in
     * memory storage -> arraylist is contigous and linedlist is incontigous
     * */

            System.out.println("-----------------------Arraylist---------------");
        List<String> arraylist = new ArrayList<String>();
        arraylist.add("abc");
        arraylist.add("bcd");
        arraylist.add(2,"Sivaji");
        System.out.println(arraylist);
        arraylist.add(3,"varma");
        arraylist.add("k");
        arraylist.add(null);
        arraylist.add(2,"updated Sivaji");
        arraylist.add("sivaji");
        System.out.println(arraylist);
        arraylist.remove(2);
        System.out.println(arraylist);
        //arraylist.add(10,"oppmn");
        System.out.println(arraylist.get(2));

        System.out.println("-----------------------LinkedList---------------");
        List<String> linkedlist = new LinkedList<String>();
        linkedlist.add("linkedabc");
        linkedlist.add("linkedbcd");
        linkedlist.add(2,"linkedSivaji");
        System.out.println(linkedlist);
        linkedlist.add(3,"linkedvarma");
        linkedlist.add("linkedk");
        linkedlist.add(null);
        linkedlist.add(1,"addedinbetween");
        //  arraylist.add(10,"oppmn");
        System.out.println(linkedlist);

        linkedlist.remove(2);

        System.out.println(linkedlist.get(2));
    }

}
