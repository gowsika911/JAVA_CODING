package Arrays;

import java.util.Scanner;

public class spiraltraversal {
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
        int top=0,left=0,bottom=R-1,right=C-1;
        while(top<=bottom && left<=right)   
        {
            //top
            for(int i=left;i<=right;i++)
            {
                System.out.print(arr[top][i]+" ");
            }
            top++;
            //right
            for(int i=top;i<=bottom;i++)
            {
                System.out.print(arr[i][right]+" ");
            }
            right--;
            //bottom
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }
            //left
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
       sc.close();
    }
    
}
