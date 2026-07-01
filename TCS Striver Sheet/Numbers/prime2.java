import java.util.*;
public class prime2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = true;
        if(n<2){
            result = false;
            System.out.println("Prime: " + result);
        }else{
            for(int i=2 ; i<=Math.sqrt(n) ; i++){
                if(n%i==0){
                    result = false;
                    break;
                }
            }
        }
        System.out.println("Prime: "+ result );
        sc.close();
    }
}
