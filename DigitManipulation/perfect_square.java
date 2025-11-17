import java.util.Scanner;
//import java.lang.Math;
public class perfect_square {
    public static void main(String[] args)
    {
          Scanner s =new Scanner(System.in);
          int n = s.nextInt();
          /*int sqrt = (int) Math.sqrt(n);
          if(sqrt*sqrt==n)
          {
              System.out.println("perfect square"); 
          }*/
          int i= 1;
          while(i*i<n){
            i++;
          }
          if(i*i==n)
          {
              System.out.println("perfect Square "); 
          }
        
          else
          {
            System.out.println("not perfect square");
          }
          s.close();
        }
          
          }

