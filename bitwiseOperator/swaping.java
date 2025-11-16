package bitwiseOperator;

public class swaping {
    public static void main(String[] args) {
      //without temp var
    int a=10;
    int b=20;
    System.out.println("a: " + a +"  "+"b: " +b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a: " + a +"  "+"b: " +b);
    System.out.println("---------------------------------------------------------------");

    //with temp var
    int x=30;
    int y= 20;
    System.out.println("x: " + x +"  "+"y: " +y);
    int z =x;
    x=y;
    y=z;
    System.out.println("x: " + x +"  "+"y: " +y);
     System.out.println("---------------------------------------------------------------");

    //using bitwise xor

    int i=10;
    int j=20;
    System.out.println("i: " + i +"  "+"j: " +j);
    i=i^j;
    j=i^j;
    i=i^j;
    System.out.println("i: " + i +"  "+"j: " +j);
System.out.println("-----------------------------------------------------");

    //HW
    if((System.out.printf("%s ","gowsi")==null))
        {
            System.out.println("gowsi");
        }
        else{
            System.out.println("Manju");
        }
}
}