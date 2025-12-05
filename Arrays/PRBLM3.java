/*
You are given a binary array (array containing only 0s and 1s).
For every index that contains 0, find the nearest 1 on the right side of that index.

If a position contains 1, you can ignore it (or keep default value).

You must output an array where:

ans[i] = index of nearest 1 to the right of position i

If no 1 exists on the right, ans[i] can remain 0 (or any default value)
*/

//telesco
//learnwithdurgesh


import java.util.Arrays;

public class PRBLM3 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1,0,1,0,0,1};
        int[] ans = new int[arr.length-1];
        int ind = 0;
        //nearest 1 from rigth to left
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]==1){
                ind = i;
            } else{
                ans[i] = ind;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));
    }
}

/*
Explanation:

At index 1 → nearest right 1 is at index 2

At index 4 → nearest right 1 is at index 5

At index 6 → nearest right 1 is at index 7

At index 8 → nearest right 1 is at index 10

At index 9 → nearest right 1 is at index 10

So the ans array will store these nearest right-side indices at corresponding zero positions.
*/