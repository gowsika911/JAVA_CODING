public class store{
    void getchocolate(int a)
    {
         System.out.println("choco chokii:" + a);
    }
    void getpowder(int a)
    {
         System.out.println("ponds:" + a);
    }
    void getsoap(int c)
    {
         System.out.println("lux:"  +c);
    }
    public static void main(String[] args)
    {
         store product1 = new store();
         product1.getchocolate(2);
         product1.getpowder(50);
         product1.getsoap(35);
    }
}