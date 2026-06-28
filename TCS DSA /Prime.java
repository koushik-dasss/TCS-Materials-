import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean prime = true;
        if(n<=1){
            prime = false;
        }else{
            for(int i=2 ; i*i <= n  ; i++){
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