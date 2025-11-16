package Arrays;
import java.util.Scanner;
public class arrayswap {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i =0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int s=0;
    int e=n-1;
    while(s<e)
    {
        int temp = arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
    }
    System.out.println("array is: ");
    for(int i =0;i<n;i++)
    {
        System.out.println( arr[i]+ " ");
    }
    sc.close();
}
}
