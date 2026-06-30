import java.util.*;
public class reverseArray2{
    public static int[] revArray(int[] arr ){
        int n = arr.length;
        int[] revArr = new int[n];
        int j = 0;
        for(int i = n-1 ; i>= n ; i--){
            revArr[j] = arr[i];
        }
        return revArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int [] result = revArray(arr);
        for(int i=0 ; i<n ; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
