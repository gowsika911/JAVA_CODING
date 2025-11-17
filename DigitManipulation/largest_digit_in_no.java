public class largest_digit_in_no {
    public static void main(String[] args) {
        int n =2345;
        int max =0;
        while(n>0)
        {  
           int lastdigit =n%10;
           if(lastdigit>max){
            max = lastdigit;
           }
           n=n/10;
        }
        System.out.println(max);
    }
}
