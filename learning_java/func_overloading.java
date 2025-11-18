public class func_overloading{
    void sum(int a,int b,int c)               //same function but here three parameters
    {
        System.out.println(a+b+c);
    }
    void sum(int a,int b)                     // same function but 2 parameter
    {
        System.out.println(a+b);
    }
    public static void main(String[] args)
    {
        func_overloading obs=new func_overloading();
        obs.sum(10,20);
        obs.sum(2,6,7);
    }
}