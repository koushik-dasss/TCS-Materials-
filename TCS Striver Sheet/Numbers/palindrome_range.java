import java.util.*;
public class palindrome_range{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ctr = 0;
        for(int i=1 ; i<=n ; i++){
            int rev = 0 ;
            int num = i;
            while(num>0){
                rev = rev*10 + num%10;
                num/=10;
            }
            if(rev == i){
                ctr++;
                System.out.println(rev);
            }
        }
        System.out.println("Total palindrome numbers: "+ ctr);
        sc.close();
    }
}