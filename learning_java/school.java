import java.util.*;
public class school{
    String passorfail(int tot)
    {
        if(tot>=35)
        {
            return "pass";    // string should be given in double quotes
        }
      return "fail";
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int mark=sc.nextInt();
        school ob = new school();
        String result=ob.passorfail(mark);
        System.out.println(result);

      //
      // school  
    }
}