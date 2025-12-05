import java.util.HashMap;

//FOR RETURNING THE TOTAL Total Continuous Subarray IN AN ARRAY

public class PRBLM8 {
    public static void main(String[] args) {
        int sum = 0;
        int[] nums = { 23, 2, 6, 4, 7 };
        int k = 6;
        int count = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;
            if (hs.containsKey(rem)) {
                int ind = hs.get(rem);
                count+=ind;
                ind++;
                hs.put(rem,ind);
            } else {
                hs.put(rem, 1);
            }
        }
        System.out.println("Total sub array: "+count);
    }
}
