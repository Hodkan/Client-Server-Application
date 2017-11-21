import java.util.Arrays; // Arrays class

public class SortAndSearch {
   public static void main(String[] args) {
      int[] numbers = {56, 34, 9, -54, 2, 99, 134}; // int array
      for (int number : numbers) { // displays the numbers before sort
         System.out.print(number + " ");
      }
      System.out.println(); // change the line
      
      Arrays.sort(numbers); // soft the numbers array in ascending order
      for (int number : numbers) { // displays the numbers after sort
         System.out.print(number + " ");
      }
      System.out.println(); // change the line
      
      /* search number */
      boolean found = false; // found is initially set to false
      
      for (int number : numbers) { // iterate the numbers for search
         if (number == 9) {
            found = true; // set found true
            break; // once found, no need to iterate the rest numbers
         }
      }
      
      if (found) { // if found, display FOUND
         System.out.print("9 found in the array");
      } else { // if not found, display NOT FOUND
         System.out.print("9 not found in the array ");
      }
   }
}
