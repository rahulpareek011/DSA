//Find the sum of every window of size 3 in the array.

/*
We must take 3 elements at a time, starting from index:

Array -> 1 | 2 | 7 | 9 | 13 | 15 | 16

0 to 2 → first 3 elements
1 to 3 → next 3 elements
2 to 4 → next 3
3 to 5
4 to 6

This is a sliding window of size 3.
*/

public class PRBLM5 {
    public static void main(String[] args) {
        //int arr[] = {1,2,7,9,13,15,16};
        int arr[] = {2,9,7,8};
        int k=3;
        int n = arr.length-k;
        int sum = 0;
        for(int i=0;i<=n;i++){
            for(int j=i;j<k;j++){
                sum+=arr[j];
            }
            System.out.print(sum+ " ");
            sum = 0;
            
            if(k<arr.length){
                k++;
            }
        }
    }
}


// Problem:
// Given an array, print the sum of every window of size 3 (fixed window size).
// Example: arr = [1,2,7,9,13,15,16]
// Windows → [1,2,7], [2,7,9], [7,9,13], ...
// Output → 10 18 29 ...

// Intuition:
// We slide a window of size 'k' across the array and keep summing elements inside the window.
// Window #1 → indices 0 to k-1
// Window #2 → indices 1 to k
// Window #3 → indices 2 to k+1
// Continue until window reaches the end.

// Logic:
// Outer loop → starting index of each window
// Inner loop → sum elements from i to i+k-1
// Reset sum after each window

// Important:
// When we reach the end and a full window of size k cannot be formed,
// we stop the loop (i <= n ensures this).

// Optimization Hint:
// Can use Sliding Window Technique → subtract arr[i-1] and add arr[i+k-1] instead of full inner loop.

