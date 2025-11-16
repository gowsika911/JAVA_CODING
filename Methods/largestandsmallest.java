package Methods;
import java.lang.System;
import java.util.Scanner;
public class largestandsmallest {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n =s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int large =a[0];
        for(int i =0;i<n;i++)
        {
           if(a[i]>large)
           {
            large=a[i];
           }
        }
        System.out.println("large: "+large);
        int small =a[0];
        for(int i =0;i<n;i++)
        {
           if(a[i]<small)
           {
            small=a[i];
           }
        }
        System.out.println("small: "+small);
     
     s.close();  
    }
    
    
}
