import java.util.*;
public class find{
        boolean evenorodd(int num)
        {
            if(num%2==0)
            {
                return true;
            }
            else{
            return false;
            }
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);        //getting input through scanner class and sc object this class and object can be user defined
        int num=sc.nextInt();
        find obj =new find();                    //object creating for the class find
       boolean value= obj.evenorodd(10);
       System.out.println(value);

    }
}