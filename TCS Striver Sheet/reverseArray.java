import java.util.*;
public class reverseArray{
    public static int[] revArray(int[] arr){
        int left = 0 , right = arr.length -1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<n ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] result = revArray(arr);
        for(int i=0 ; i<n ;i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
