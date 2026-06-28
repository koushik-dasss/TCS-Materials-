import java.util.*;
public class lcm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b = sc.nextInt() , product = a*b;
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        int GCD = a ;
        int LCM = product/GCD;
        System.out.println(GCD);
        System.out.println(LCM);
    }
}
