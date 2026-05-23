// Problem: Sort Colors (LeetCode 75)
// Approach: Dutch National Flag Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Arrays;

public class SortColors {

    public void sortColors(int[] nums) {
        int low = 0;          // boundary for 0s
        int mid = 0;          // current pointer
        int high = nums.length - 1; // boundary for 2s

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++; mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        SortColors sc = new SortColors();

        int[] nums = {2, 0, 2, 1, 1, 0};

        sc.sortColors(nums);

        System.out.println("Sorted Array: " + Arrays.toString(nums));
    }
}
