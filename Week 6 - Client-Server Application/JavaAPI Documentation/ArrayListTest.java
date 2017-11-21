import java.util.List; // List is and ordered collection
import java.util.ArrayList; // ArrayList is a resizable array

public class ArrayListTest {
   public static void main(String[] args) {
      // List Example implement with ArrayList
      List<String> list = new ArrayList<>();
      
      list.add("Java"); // add() method is used to an item to the list
      list.add("C#");
      list.add("AS3");
      list.add("Android");
      
      for (int i = 0; i < list.size(); i++) { // iterate the items
         String item = list.get(i); // get method returns the element at the specified position
         System.out.println("Item " + i + " = " + item);
      }
   }
}
