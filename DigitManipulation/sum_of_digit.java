package Digitmanipulation;
public class sum_of_digit {
    public static void main (String[] args)                      // step1 :0+3              last digit-> n%10
    {                                                             // step2: 3+2=5           remove last number-> n/10
        int n= 5678,sum=0;                                      //Step3: 5+1=6               reverse digit-> rev*10
        while(n>0)
        {
            sum=sum+(n%10);
            n=n/10;
        }
        System.out.print(sum);
    }
    
}
