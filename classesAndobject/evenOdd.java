package classesAndobject;
class evenorodd{
    public String num(int n)
    {
        if(n%2==0)
        {
            return "Even number";
        }
        else
        {
            return "Odd number";
        }
    }
}

public class evenOdd {
    public static void main(String[] args) {
        evenorodd e1 =new evenorodd();
        System.out.println(e1.num(7));
    }

    
}
