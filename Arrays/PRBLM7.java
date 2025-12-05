//Given Binary array -> 001111 
//Check it is sorted or not

public class PRBLM7 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1};
        int min = 0;
        int max = 0;
        Boolean isSorted = true;
        
        for(int i=0;i<arr.length;i++){
            min = max;
            max = arr[i];
            if(max==0 && min==1){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Binary array is sorted");
        }else{
            System.out.println("Binary array is not sorted");
        }
        
    }
}
