/* 
Q. Given an array arr[] of size N and a list of Q queries,
where each query is represented as [L, R],
print the sum of elements from index L to R for every query.

Example-
Input:
Array: [10, 12, 13, 15, 16]
Queries: [ [0,2], [1,3], [2,4] ]


Explanation:

Query [0,2] → sum of elements from index 0 to 2
10 + 12 + 13 = 35

Query [1,3] → sum of elements from index 1 to 3
12 + 13 + 15 = 40

Query [2,4] → sum of elements from index 2 to 4
13 + 15 + 16 = 44

Output: 35 40 44
*/
import java.util.Arrays;

public class PRBLM6 {
    public static void main(String[] args) {
        // Given array
        int[] arr = {10, 12, 13, 15, 16};

        // Each query contains a range [L, R]
        int[][] queries = {{0,2}, {1,3}, {2,4}};

        // To store sum for each query separately
        int[] result = new int[queries.length];

        int sum = 0;  // Variable to calculate sum for each query

        // Loop through each query
        for(int i = 0; i < queries.length; i++){

            // Extract L and R from query
            // queries[i][0] = L , queries[i][1] = R
            for(int j = queries[i][0]; j <= queries[i][1]; j++){

                // Add elements from L to R
                sum += arr[j];

                // Store sum of current query in result array
                result[i] = sum;
            }

            // Print sum for this query
            System.out.print(sum + " ");

            // Reset sum for the next query
            sum = 0;
        }

        System.out.println();

        // Print final result array (all query sums)
        System.out.println(Arrays.toString(result));
    }
}

/*
Explanation

queries[i][0] = L
queries[i][1] = R
→ So for each query, you run a loop from L to R.
You keep adding elements inside that range to sum.
After finishing one full range, you reset sum = 0 to start fresh for the next query.
result[i] stores the sum for each separate query.
*/

