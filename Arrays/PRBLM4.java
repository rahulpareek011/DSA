//Find the distance of each element from the nearest 1 in a binary array.

import java.util.Arrays;
import java.util.Scanner;

public class PRBLM4 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,0,0,1,1,1,0,1,0,1};
        int[] leftNearestOne = new int[arr.length];
        
        int ind = -1;

        for(int i=0; i<arr.length;i++){
            if(arr[i] == 1) ind = i;
            leftNearestOne[i] = ind;
        }
        System.out.println("Left nearest one: "+Arrays.toString(leftNearestOne));

        int[] rightNearestOne = new int[arr.length];
        int ind2 = 0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] == 1) ind2 = i;
            rightNearestOne[i] = ind2;
        }
        System.out.println("Right nearest one: "+Arrays.toString(rightNearestOne));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index for that you want to find nearest one: ");
        int t = sc.nextInt();

        int leftDistance = t-leftNearestOne[t];
        int rigthDistance = rightNearestOne[t] - t;

        if(leftDistance<=rigthDistance){
            System.out.println("Nearest One at index: "+ leftNearestOne[t]);
        }else{
            System.out.println("Nearest One at index: "+ rightNearestOne[t]);
        }
    }
}


/*
    -------------------------------------------
    PROBLEM SUMMARY:
    -------------------------------------------
    Given a binary array (only 0 and 1),
    for any index 't' we want to find the nearest index 
    where the value is 1.

    A 0 may have a 1 on its left side or right side.
    We must check both directions and choose the minimum distance.

    -------------------------------------------
    KEY IDEA (Two-pass technique):
    -------------------------------------------
    1. Make an array leftNearestOne[]
       For each index i, it stores the index of the 
       nearest 1 present on the LEFT side of i.

       If no 1 has appeared yet, store -1.

       This is done using a LEFT → RIGHT scan.
       We keep track of last seen '1' using a variable 'ind'.

    2. Make an array rightNearestOne[]
       For each index i, it stores the index of the
       nearest 1 present on the RIGHT side of i.

       If no 1 is present to the right, store -1.

       This is done using a RIGHT → LEFT scan.
       We keep track of last seen '1' using a variable 'ind2'.

    -------------------------------------------
    HOW DISTANCE IS CALCULATED:
    -------------------------------------------
    For any target index t:

        leftDistance  = 
            if leftNearestOne[t] == -1 
                no 1 on left → INF  
            else  
                t - leftNearestOne[t];

        rightDistance = 
            if rightNearestOne[t] == -1
                no 1 on right → INF
            else
                rightNearestOne[t] - t;

    -------------------------------------------
    FINAL ANSWER:
    -------------------------------------------
    Compare:
        leftDistance vs rightDistance

    The smaller one gives the nearest '1' index.
    If equal, both sides are equally near.

    -------------------------------------------
    WHY THIS TECHNIQUE IS USED?
    -------------------------------------------
    - Only TWO scans (O(n)) → extremely fast
    - Avoids nested loops (which would be O(n²))
    - Guaranteed nearest 1 f
*/