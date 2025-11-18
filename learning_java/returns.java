
public class returns
{
  int getsum(int a ,int b)
  {
    int c =a+b;
    return c;
  }
  String getname()
  {
    return "gowsi";
  }
  String getad()
  {
     return " ramanatha street, chennai 04";
  }
  int phone(int a)
  {
       
       return a;
    }
  
public static void main(String[] args)
{
       returns ob=new returns();
       int tot=ob.getsum(10,30);
       String name=ob.getname();
       String address=ob.getad();
       int numb=ob.phone(1234567891);
    System.out.println(tot);
    System.out.println(name);
    System.out.println(address);
    System.out.println(numb);
}
}