
public class calc_fun
{
    void getsum(int a,int b)
    {
        int sum=a+b;
        System.out.println(sum);

    }
    void getsub(int a,int b)
    {
        
        System.out.println(a-b);

    }
    void getmul(int a,int b)
    {
        
        System.out.println(a*b);

    }
    void getdiv(int a,int b)
    {
        
        System.out.println(a/b);

    }
    
    public static void main(String args[])
    {
        calc_fun ob = new calc_fun();
        ob.getsum(10,2);
        ob.getsub(10, 2);
        ob.getmul(  10,  2);
        ob.getdiv(10,2);
    }
}