package Digitmanipulation;
import java.util.Scanner;
public class power_of_two {
    public static void main(String[] args)
    {
          Scanner s =new Scanner(System.in);
          int n = s.nextInt();
          int i= 1;
          while(i<n){
            i=i*2;
          }
          if(i==n)
          {
              System.out.println("The n is power of 2"); 
          }
        
          else
          {
            System.out.println("not pow of 2");
          }
          s.close();
          }
          
    }

