import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        int n=193,arm=0;
        int temp = n;
       while(n>0)
        {
            int lastdigit =n%10;
            arm=arm + (int)Math.pow(lastdigit,3); // (or) arm+=lastdigit*lastdigit*lastdigit
            n=n/10;
        }
        if(temp==arm){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
    
}
