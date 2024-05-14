package generics.generics_pt_2;

import java.util.HashSet;

public class RepeatingIntegers {

    public static void printRepeatingIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> repeated = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) { // If already present in set, it's a repeated integer
                repeated.add(num);
            }
        }
        for (int num:nums) {
            System.out.println(num);
        }
        System.out.println("Repeating integers in the array:");
        for (int num : repeated) {
            System.out.println(num);
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 9, 1};
        printRepeatingIntegers(nums);
    }
}

