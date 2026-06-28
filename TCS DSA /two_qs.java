import java.util.*;
public class two_qs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean prime = true;
        if(n<=1){
            prime = false;
        }else{
            for(int i=2 ; i<=Math.sqrt(n) ; i++){
                if(n%i == 0){
                    prime = false;
                    break;
                }
            }
        }
        System.out.println(prime ? n + " is a prime number " : n + " is not a prime number.");
        System.out.println(n%2 == 0 ? n + " is an even number " : n + " is an odd number");
        sc.close();
    }
}
