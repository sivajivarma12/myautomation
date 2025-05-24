import java.util.*;

public class collectionsmaps {

    public static void main(String args[])
    {
     /*Maps:
     * Maps stores values in key and values
     * key should be uniques and values can be duplicate
     * */

        /* HashMap:
Keys will be sorted, starts with null key and
It allows null values for keys and values. sorted keys
 */
        System.out.println("----------------HashMaps-------------------");
        Map<Integer,String> hashmap1 = new HashMap<Integer,String>();
        hashmap1.put(1,"sivaji");
        hashmap1.put(2,"varma");
        hashmap1.put(7,"varma7");
        hashmap1.put(3,null);
        hashmap1.put(null,"sivaji");
        System.out.println(hashmap1);
        hashmap1.replace(2,"tef");
        System.out.println(hashmap1.get(null));
        System.out.println(hashmap1);

    /* LinkedHashMap:
Keys will not be sorted, it stores data in insertion order
It allows null values for keys and values.
 */
        System.out.println("----------------LinkedHash---------------------------");
        Map<Integer,String>  linkedhashmap1 = new LinkedHashMap<Integer,String>();
        linkedhashmap1.put(1,"sivaji");
        linkedhashmap1.put(2,"varma");
        linkedhashmap1.put(7,"varma7");
        linkedhashmap1.put(3,null);
        linkedhashmap1.put(null,"sivaji");
        System.out.println(linkedhashmap1);
        linkedhashmap1.replace(2,"tef");
        System.out.println(linkedhashmap1.get(null));
        System.out.println(linkedhashmap1);

         /* TreeMap:
Keys will be sorted,
It allows won't allow null for keys and it will allow null values.
 */
        System.out.println("---------------TreeMap----------------------------");
        Map<Integer,String>  treemap1 = new TreeMap<Integer, String>();
        treemap1.put(1,"sivaji");
        treemap1.put(2,"varma");
        treemap1.put(7,"varma7");
        treemap1.put(3,null);
     //   treemap1.put(null,"sivaji");
        System.out.println(treemap1);
        treemap1.replace(2,"tef");
      //  System.out.println(treemap1.get(null));
        System.out.println(treemap1);

         /* Hashtable:
Keys will be sorted,
It allows won't allow null for keys and values.
 */
        System.out.println("----------------------HashTable---------------------");
        Map<Integer,String>  hashtable = new Hashtable<Integer, String>();
        hashtable.put(1,"sivaji");
        hashtable.put(2,"varma");
        hashtable.put(7,"varma7");
        //hashtable.put(3,null);
        //   treemap1.put(null,"sivaji");

        System.out.println(hashtable);
        hashtable.replace(2,"tef");
        //  System.out.println(treemap1.get(null));
        System.out.println(hashtable);
    }
}
/* HashMap:
Keys will be sorted
It allows null values for keys and values.
 */