import java.util.*;
public class binarySearch {
    public static int binarySearch(int[] arr , int target){
        int low = 0 ,  high = arr.length - 1 ;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0 ; i< n ; i++){
            for(int j=0 ; j< n-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0 ; i< n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int target = sc.nextInt();
        int result = binarySearch(arr, target);
        if(result == -1){
            System.out.println(target + " not found ");
        }else{
            System.out.println(target + " found at position " + result);
        }
        // System.out.println(mid);



        sc.close();
    }
    
}
