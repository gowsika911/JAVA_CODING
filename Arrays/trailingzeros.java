package Arrays;
import java.util.Scanner;
class trailingzeros{
    public static void main(String[] args)
{
  Scanner s = new Scanner(System.in);
  int n = s.nextInt();
  int[] a = new int[n];
  for(int i =0;i<n;i++)
  {
    a[i]= s.nextInt();
  }
  for(int i=0;i<n;i++)
  {
    a[i]=a[i+1];
    a[i+1]=a[i];
  }
  for(int i =0;i<n;i++)
  {
    System.out.print(a[i]+" ");
  }
}
}