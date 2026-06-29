import java.util.*;
public class smallestElementArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0 ;i<n ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int i=0 ;i<n ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(arr[0]);
        sc.close();
    }

}
