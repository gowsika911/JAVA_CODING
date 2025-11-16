package classesAndobject;
class Max{
         public int max(int a,int b)
         {
            if(a>b)
            {
                return a;
            }
            else
            {
                return b;
            }
         }
}
public class Maximum {
    public static void main(String[] args) {
        Max m1 =new Max();
        System.out.println(m1.max(10,5));
    }
    
}
