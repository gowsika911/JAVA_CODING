public class enhanced_forloop{
    public static void main(String[] args)
    {
        int num[]={1,3,4,5,8};
       // for(int i=0;i<5;i++)        // normal method    
        
        for(int var:num)              // for each loop
        {
            //System.out.println(num[i]);
            System.out.println(var);                    
        }
    }
}