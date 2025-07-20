public class BruteForceSol {
    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        int n = arr.length;
        int cnt = 0;

        for (int i = 0 ; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int K = i; K <= j; K++) {
                    sum += arr[K];
                }
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }
}
// Time Complexity:

// O(N3), where N = size of the array.
// Reason: We are using three nested loops here. Though all are not running for exactly N times, the time complexity will be approximately O(N3).

// Space Complexity: O(1) as we are not using any extra space.