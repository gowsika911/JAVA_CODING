public class mobile{
    
        static void iphone()
        {
            System.out.println("this is i phone");
            samsaung();
        }
       static void samsaung()
        {
            System.out.println("this is sams");
        }
        void oppo()
        {
            System.out.println("this is oppoe");
        }
        void realme()
        {
            System.out.println("this is i realme");
        }
    
    public static void main(String args[])
    {
        mobile type1 = new mobile();
        type1.samsaung();
        type1.iphone();
        type1.realme();
        type1.oppo();

}
}