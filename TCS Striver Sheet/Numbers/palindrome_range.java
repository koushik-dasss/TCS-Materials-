import java.util.*;
public class palindrome_range{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ctr = 0;
        for(int i=n1 ; i<=n2 ; i++){
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