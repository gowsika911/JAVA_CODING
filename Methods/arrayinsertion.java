package Methods;
import java.util.Scanner;
class arrayinsertion{
    public static void main(String[] args)
    {
          Scanner s = new Sacnner(System.in);
          int n = s.nextInt();
          int[] arr = new int[n+1];
          for(int i=0;i<n;i++)
          {
            arr[i]=s.nextInt();

          }
          ind = s.nextInt();
          val=s.nextInt();
          insertion(arr,ind,val)
    }
    public static int[] insertion(int[] arr ,int ind,int val)
    {
        for(int i,arr.lenth-1;i>ind;i--)
        {
            arr[i]=arr[i-1];
        }
        return arr[i]
    }
}