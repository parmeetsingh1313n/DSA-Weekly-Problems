public class OptimalApp {
    public static int findingMin(int[] arr) {
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            } else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] arr1 = { 6, 7, 8, 1, 2, 3, 1 };
        System.out.println("Test Case 1: Minimum is " + findingMin(arr1));

        // Test Case 2
        int[] arr2 = { 2, 3, 4, 1, 1 };
        System.out.println("Test Case 2: Minimum is " + findingMin(arr2));

        // Test Case 3
        int[] arr3 = { 1, 2, 3, 4, 5, 1 };
        System.out.println("Test Case 3: Minimum is " + findingMin(arr3));

        // Test Case 4
        int[] arr4 = { 4, 5, 1, 2, 3, 1 };
        System.out.println("Test Case 4: Minimum is " + findingMin(arr4));

        // Test Case 5
        int[] arr5 = { 99, 99 };
        System.out.println("Test Case 5: Minimum is " + findingMin(arr5));

        // Original Test Case
        int[] arr6 = { 4, 5, 6, 7, 0, 1, 2, 3 };
        System.out.println("Original Case: Minimum is " + findingMin(arr6));
    }
}

// Complexity Analysis

// Time Complexity:

// O(logN), N = size of the given array.
// Reason: We are basically using binary search to find the minimum.

// Space Complexity: O(1)
// Reason: We have not used any extra data structures, this makes space complexity, even in the worst case as O(1).