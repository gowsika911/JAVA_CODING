package Methods;

class Main{
    //without arguments and without return type
    public void sum()
    {
        int a = 10;
        int b = 10;
        int z =a+b;
        System.out.println(z);
    }
    //without arguments and with return type
    public int sub()
    {
        int c=10;
        int d=20;
        return c-d;
    }

}
public class type3_type4 {
    public static void main(String[] args) {
    Main  s = new Main();
    System.out.println(s.sub());
    s.sum();
    
}
}

