package Arrays;

import java.util.Scanner;

public class sumofrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R][C];
        System.out.println("matrix:");
        for(int i =0;i<R;i++)
        {
        
            for(int j=0;j<C;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        
        for(int i =0;i<R;i++)
        {
            int sum=0;
            for(int j=0;j<C;j++)
            {
                 sum +=arr[i][j];
            }
            System.out.println("row:"+ (i+1) + " = " +sum);
        }
        sc.close();
    }
    
}
