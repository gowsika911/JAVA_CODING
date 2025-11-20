package Methods;
class armstrongusingmethod{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        boolean found = false;
        for(int i = start;i<=end;i++)
        {
            if(isArmstrong(i))
            {
                System.out.println(i+ " ");
                found = true;
            }
        }
        if(!found)
        {
            System.out.println("No elements");
        }
    }
    public static boolean isArmstrong(int n)
    {
        int original =n;
        int count= count(n);
        int sum=0;
        while(n!=0)
        {
            int last = n%10;
            sum+=power(last,count);
            n/=10;
        }
        return sum==original;
    }
    public int count(int n)
    {
       int  count=0;
       while(n>0)
       {
        count++;
        n/=10;
       }
       return count
    }
    public static void power(int base,int exp)
    {
        int res=1;
        for(int i =1;i<=exp;i++)
        {
            res*=base;
        }
        return res;
    }
}