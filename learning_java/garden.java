public class garden
{
    int a_price=20;
    int a_count=5;
    void total_money()
    {
        int tot=a_count*a_price;
        System.out.print(tot);

    }
    public static void main(String args[])
    {
        garden ob = new garden();
        ob.total_money();
    }
}