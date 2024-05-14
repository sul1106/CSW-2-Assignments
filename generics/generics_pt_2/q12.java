package generics.generics_pt_2;
import java.util.*;

public class q12 {
    public static void main(String[] args) {
        int[] arr = {1,2,10,8,7,3,4,6,5,9};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
        }
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}
