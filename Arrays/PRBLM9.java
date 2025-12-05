//binary search of array

public class PRBLM9 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// mid = 5-> index value-> 6
        int i = 0;
        int j = arr.length - 1;
        int key = 10;
        while (i <= j) {
            int mid = (i + j) / 2;

            if (key == arr[mid]) {
                System.out.println("Key " + arr[mid] + " Occur at " + mid + " index");
                break;
            }
            else if(key > arr[mid]) {
                i = mid + 1;
                j = arr.length - 1;
            }
            else if (key < arr[mid]) {
                i = 0;
                j = mid - 1;
            }
            System.out.println(i+ " "+ j);
        }
    }
}
