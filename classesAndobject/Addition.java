package classesAndobject;
class sum{
    public int add(int a,int c)
    {
        return a+c;
    }
}
public class Addition {
    public static void main(String[] args) {
        sum s1 =new sum();
        System.out.println(s1.add(10,5));
    }
}
