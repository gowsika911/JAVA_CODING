package Methods;

class Type1_type2{

    public static void Sumofdigits(int n)             //with arguments without return type
    {
        int sum=0;
        while(n!=0)
        {
            int last =n%10;
            sum=sum+last;
            n/=10;
        }
        System.out.println(sum);
    }
    public int countofdigits(int n)                   //with arguments with return type
    {
        int count =0;
        while(n!=0)
        {
            count++;
            n/=10;
        }
        return count;
    }
    public String palindrome(int n)
    {
        int rev=0;
        int temp=n;
        while(n!=0)
        {
            int last =n%10;
            rev = rev*10+last;
            n/=10;
        }
        if(temp==rev)
        {
            return "palindrome";

        }
        else{
            return "Not palindrome";
        }
    
     }
    public static void main(String[] args) {
        System.out.println("Sum of digits");
        Sumofdigits(123);
        Type1_type2 e =new Type1_type2();
        System.out.println("count of digit:"+e.countofdigits(1234));
        System.out.println("palindrome or not: " +e.palindrome(123));
       

    }
}
