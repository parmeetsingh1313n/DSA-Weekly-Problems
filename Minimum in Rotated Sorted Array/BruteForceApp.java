public class BruteForceApp {

    public static int findingMinimum(int[] arr) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        return mini;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] arr1 = { 6, 7, 8, 1, 2, 3, 1 };
        System.out.println("Test Case 1: Minimum is " + findingMinimum(arr1));

        // Test Case 2
        int[] arr2 = { 2, 3, 4, 1, 1 };
        System.out.println("Test Case 2: Minimum is " + findingMinimum(arr2));

        // Test Case 3
        int[] arr3 = { 1, 2, 3, 4, 5, 1 };
        System.out.println("Test Case 3: Minimum is " + findingMinimum(arr3));

        // Test Case 4
        int[] arr4 = { 4, 5, 1, 2, 3, 1 };
        System.out.println("Test Case 4: Minimum is " + findingMinimum(arr4));

        // Test Case 5
        int[] arr5 = { 99, 99 };
        System.out.println("Test Case 5: Minimum is " + findingMinimum(arr5));

        // Optional original test case
        int[] arr6 = { 4, 5, 6, 7, 0, 1, 2, 3 };
        System.out.println("Original Case: Minimum is " + findingMinimum(arr6));
    }
}

// Complexity Analysis

// Time Complexity:

// O(N), N = size of the given array.
// Reason: We have to iterate through the entire array to check if the target is present in the array.

// Space Complexity: O(1)
// Reason: We have not used any extra data structures, this makes space complexity, even in the worst case as O(1).
