// import java.util.Scanner;
// public class prime{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         boolean result = true;
//         if(n<=1){
//             result = false;
//         }else{
//             for(int i=2 ; i*i<=n ; i++){
//                 if(n%i==0){
//                     result = false;
//                     break;
//                 }
//             }
//         }
//         System.out.println(result ? n + " is a prime number ": n + " is not a prime number.");
//         sc.close();        
//     }
// }
import java.util.*;
public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean prime = true;
        if(n<=1){
            prime = false;
        }else{
            for(int i=2 ; i<= Math.sqrt(n) ; i++){
                if(n%i == 0){
                    prime = false;
                    break;
                }
            }
        }
        System.out.println(prime ? n + " is a prime number." : n + " is not a prime number.");
        sc.close();
    }
}
