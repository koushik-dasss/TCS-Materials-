import java.util.*;
public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =  n , rev = 0 ;
        while(n>0){
            rev = rev*10 + n%10;
            n/=10;
        }
        System.out.println("Palindrome : " + (num==rev) );
        sc.close();
    }
}