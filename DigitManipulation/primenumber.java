import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = s.nextInt();
        boolean isprime = true;
        if(n<=1)
        {
            isprime = false;
        }
        else{
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime)
        {
            System.out.println("is a prime number");
        }
        else{
            System.out.println("not a prime number");
        }
        s.close();
    }
    
}
