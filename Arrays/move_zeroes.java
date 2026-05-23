// Problem: Move All Zeroes to End
// Approach: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void moveZeroes(int[] arr) {

        int j = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();
      
        int[] arr = {0,1,3,4,2,0,5,0,9};
        obj.moveZeroes(arr);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
