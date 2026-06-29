import java.util.*;
public class secondsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0 ;i<n ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int min = arr[0] ;
        for(int i=0 ;i<n ;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
        int min2 = arr[0];
        for(int i=0 ; i<n ;i++){
            if(arr[i]!= min && arr[i]<min){
                min2 = arr[i];
            }
        }
        System.out.println(min2);
        sc.close();
    }
}
