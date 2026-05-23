// Problem: Rotate Array by K positions
// Includes: Right Rotation (Optimal), Left Rotation, Brute Force
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    // RIGHT ROTATION (OPTIMAL - Reverse Method)
    public void rotateRight(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    // LEFT ROTATION (OPTIMAL - Reverse Method)
    public void rotateLeft(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    // BRUTE FORCE (Right Rotation): Time: O(n × k) Space: O(1)
    public void rotateRightBrute(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        for(int i = 0; i < k; i++){
            int last = arr[n - 1];

            for(int j = n - 1; j > 0; j--){
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }

    // Helper function
    public void reverse(int[] arr, int i, int j) {
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Test
    public static void main(String[] args) {

        Solution obj = new Solution();
        int[] arr = {1,2,3,4,5};

        obj.rotateRight(arr, 2);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
