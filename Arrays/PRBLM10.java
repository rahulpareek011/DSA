import java.util.HashMap;

// LeetCode #523 – Continuous Subarray Sum

public class PRBLM10 {
    public static void main(String[] args) {
        int sum = 0;  // Used to store prefix sum
        int[] nums = {23,2,4,6,6};
        int k = 7;

        boolean isSubarray = false;

        // Map will store: remainder -> earliest index where this remainder was seen
        // We put (0, -1) to handle cases where subarray starts from index 0
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0, -1);

        // Traverse the array and calculate prefix sums
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // Find remainder when prefix sum is divided by k
            int rem = sum % k;

            // If this remainder was seen before, subarray sum between those two indices is divisible by k
            if (hs.containsKey(rem)) {
                int prevIndex = hs.get(rem);

                // Length of that subarray must be at least 2 (as per LeetCode rule)
                if ((i - prevIndex) > 1) {
                    isSubarray = true;
                    break;
                }
            } else {
                // Store remainder with index only if not present already
                // because we need the earliest index for maximum subarray length
                hs.put(rem, i);
            }
        }

        // Final result
        if (isSubarray) {
            System.out.println("It is a valid subarray.");
        } else {
            System.out.println("It is not a valid subarray.");
        }
    }
}
