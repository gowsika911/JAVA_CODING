package classesAndobject;
class circle
{
    public double display(int r)
    {
       double area=3.14*r*r;
         return area;
    }
}
public class Area {
    public static void main(String[] args) {
        circle c1 = new circle();
        System.out.println(c1.display(5));
        
    }
    
}
