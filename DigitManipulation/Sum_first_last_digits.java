public class Sum_first_last_digits {
    public static void main(String[] args) {
        int n=342;
        int sum=0;
        int lastdigit = n%10;
        int firstdigit=n/100;
      /*   while(n>=10)
        {
            n=n/10;
        }*/
        // sum=lastdigit+n;
        sum=lastdigit+firstdigit;
        System.out.println(sum);

    }
    
}
