package generics.generics_pt_2;
import java.util.*;
public class q11 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 2, 8, 4, 5, 10, 6}; // Example unsorted array
        
    // Create a HashMap to store elements from the array
    HashMap<Integer, Boolean> map = new HashMap<>();
    
    // Add all elements from the array to the map
    for (int num : arr) {
        map.put(num, true);
    }
    
    // Check for the smallest positive number missing in the array
    int smallestMissing = 1;
    while (map.containsKey(smallestMissing)) {
        smallestMissing++;
    }
    
    // Print the smallest missing positive number
    System.out.println("Smallest missing positive number: " + smallestMissing); 
    }
   
}
