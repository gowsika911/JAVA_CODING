
public class sum_of_even_and_odd{
    public static void main(String[] args)
    {
       int  sum=0;
        int i = 1;
        while(i<=10)
        {
            i++;
             /*if(i%2==0) 
            {
                sum+=i;
               
            }  ....this for even*/
              if(i%2!=0)
              {
                sum+=i;
              }

        }
        System.out.println("sum of odd number is:"+sum);
       
    }

    
}