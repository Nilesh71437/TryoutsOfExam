import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrimeOrNot p = new PrimeOrNot();
        System.out.println(p.isPrime(n));
    }
    static class PrimeOrNot{


        static boolean isPrime(int n) {
            if(n<=1)
                return false;
            for(int i =2;i*i<=n;i++)
            {
                if(n%i == 0)
                    return  false;
            }
            return true;
        }
    }
}
