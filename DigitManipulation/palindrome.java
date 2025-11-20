package Digitmanipulation;
public class palindrome {
    public static void main(String[] args)
    {
        int n = 321;
        int originalN=n;
        int rev =0;
        while(n>0) // we can also use while(n!=0) // for(int i=n;i>0;i/=10)
        {
         int lastdigit = n%10;
         rev=rev*10+lastdigit;
         n=n/10; //  n/=10
        }   
        System.out.println(rev);
        if(rev==originalN)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    
    }
}
