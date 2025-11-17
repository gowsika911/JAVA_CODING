public class prouduct_of_digits {
    public static void main(String[] args)
    {
        int n = 223;
        int prod=1;
        while(n>0)
        {
            prod=prod*(n%10);
            n=n/10;   
        }
        System.out.println(prod);
    }
    
}
