public class PaintHouseLayman {
    public static int findMinCost(int[][] cost) {
        int n = cost.length;
        int k = cost[0].length;

        if (n == 0 || k == 0)
            return 0;

        int min1 = -1, min2 = -1;

        for (int i = 0; i < n; i++) {
            int lastMin1 = min1;
            int lastMin2 = min2;
            min1 = -1;
            min2 = -1;

            for (int j = 0; j < k; j++) {
                if (i > 0) {
                    if (j != lastMin1) {
                        cost[i][j] += cost[i - 1][lastMin1];
                    } else {
                        cost[i][j] += cost[i - 1][lastMin2];
                    }
                }

                if (min1 == -1 || cost[i][j] < cost[i][min1]) {
                    min2 = min1;
                    min1 = j;
                } else if (min2 == -1 || cost[i][j] < cost[i][min2]) {
                    min2 = j;
                }
            }
        }

        return cost[n - 1][min1];
    }

    public static int[][] copy(int[][] arr) {
        int[][] result = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i].clone();
        }
        return result;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[][] cost1 = {
                { 1, 2 },
                { 2, 1 }
        };
        System.out.println("Test Case 1 Output: " + findMinCost(copy(cost1)));

        // Test Case 2
        int[][] cost2 = {
                { 1, 5, 3 },
                { 1, 9, 1 },
                { 3, 2, 4 }
        };
        System.out.println("Test Case 2 Output: " + findMinCost(copy(cost2)));

        // Test Case 3
        int[][] cost3 = {
                { 8, 2 },
                { 4, 3 },
                { 1, 7 }
        };
        System.out.println("Test Case 3 Output: " + findMinCost(copy(cost3)));

        // Test Case 4
        int[][] cost4 = {
                { 1, 1, 1 },
                { 1, 1, 1 },
                { 1, 1, 1 }
        };
        System.out.println("Test Case 4 Output: " + findMinCost(copy(cost4)));

        // Test Case 5
        int[][] cost5 = {
                { 7, 3, 8, 6, 1, 2 },
                { 5, 6, 7, 2, 4, 3 },
                { 10, 1, 4, 9, 7, 6 }
        };
        System.out.println("Test Case 5 Output: " + findMinCost(copy(cost5)));

        // Test Case 6
        int[][] cost6 = {
                { 3, 4 },
                { 2, 3 }
        };
        System.out.println("Test Case 6 Output: " + findMinCost(copy(cost6)));

        // Test Case 7
        int[][] cost7 = {
                { 1, 10, 3 },
                { 9, 2, 8 },
                { 4, 5, 6 }
        };
        System.out.println("Test Case 7 Output: " + findMinCost(copy(cost7)));

        // Test Case 8
        int[][] cost8 = {
                { 5, 5 },
                { 5, 5 },
                { 5, 5 }
        };
        System.out.println("Test Case 8 Output: " + findMinCost(copy(cost8)));

        // Test Case 9
        int[][] cost9 = {
                { 1, 100 },
                { 100, 1 },
                { 1, 100 }
        };
        System.out.println("Test Case 9 Output: " + findMinCost(copy(cost9)));

        // Test Case 10
        int[][] cost10 = {
                { 1, 2, 3, 4 },
                { 4, 3, 2, 1 }
        };
        System.out.println("Test Case 10 Output: " + findMinCost(copy(cost10)));

        // Test Case 11
        int[][] cost11 = {
                { 1, 20 },
                { 20, 1 },
                { 1, 20 }
        };
        System.out.println("Test Case 11 Output: " + findMinCost(copy(cost11)));

        // Test Case 12
        int[][] cost12 = {
                { 2, 1, 3 },
                { 6, 4, 5 },
                { 7, 8, 9 }
        };
        System.out.println("Test Case 12 Output: " + findMinCost(copy(cost12)));

        // Test Case 13
        int[][] cost13 = {
                { 10, 15 },
                { 1, 1 },
                { 5, 6 },
                { 7, 3 }
        };
        System.out.println("Test Case 13 Output: " + findMinCost(copy(cost13)));

        // Test Case 14
        int[][] cost14 = {
                { 3, 2 },
                { 1, 4 },
                { 2, 3 },
                { 4, 5 }
        };
        System.out.println("Test Case 14 Output: " + findMinCost(copy(cost14)));

        // Test Case 15
        int[][] cost15 = {
                { 1, 2 },
                { 1, 2 },
                { 1, 2 }
        };
        System.out.println("Test Case 15 Output: " + findMinCost(copy(cost15)));

        // Test Case 16
        int[][] cost16 = {
                { 3, 2, 1 },
                { 2, 1, 3 },
                { 1, 3, 2 },
                { 3, 1, 2 }
        };
        System.out.println("Test Case 16 Output: " + findMinCost(copy(cost16)));

        // Test Case 17
        int[][] cost17 = {
                { 20, 10 },
                { 10, 20 },
                { 20, 10 },
                { 10, 20 },
                { 20, 10 }
        };
        System.out.println("Test Case 17 Output: " + findMinCost(copy(cost17)));

        // Test Case 18
        int[][] cost18 = {
                { 5, 6, 7 },
                { 6, 5, 8 },
                { 7, 6, 5 }
        };
        System.out.println("Test Case 18 Output: " + findMinCost(copy(cost18)));

        // Test Case 19
        int[][] cost19 = {
                { 9, 8, 7, 6 },
                { 6, 7, 8, 9 },
                { 9, 6, 8, 7 }
        };
        System.out.println("Test Case 19 Output: " + findMinCost(copy(cost19)));

        // Test Case 20
        int[][] cost20 = {
                { 1, 2 },
                { 2, 1 },
                { 1, 2 },
                { 2, 1 }
        };
        System.out.println("Test Case 20 Output: " + findMinCost(copy(cost20)));
    }
}

// Time Complexity: O(n * k)
// Space Complexity: O(1) - We are modifying the input array in place and not
// using any additional space proportional to the input size.