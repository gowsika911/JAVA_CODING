package Methods;
import java.util.Scanner;
public class oddoreven {
    public static void main(String[] args) {
       /*  int n =2;
        int i =0;
        while(i<=n){
             i++;
        }
            if(2*n==i*n)
            {
                System.out.println("even");
            }
        else{
            System.out.println("odd");
        }*/
        Scanner s =new Scanner(System.in);
        int n =s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        oddoreven oe = new oddoreven();
        oe.evencount(a,n);
        oddoreven.oddcount(a,n);
        s.close();
    }
        public void evencount(int a[],int n)
        {
            int evencount=0;
            for(int i=0;i<n;i++){
                if((a[i]&1)==0)
            {
                evencount++;
            }
         }
         System.out.println("even: "+ evencount);
                          }
                         
         
        public static int oddcount(int a[],int n)
        {
            int oddcount=0;
            for(int i=0;i<n;i++){
                if((a[i]&1)!=0)
            {
                oddcount++;
            }
            }
             return oddcount;
        }
        
    
}
