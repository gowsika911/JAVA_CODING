package Arrays;

import java.util.Scanner;

public class spiral {
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
        int sr=0,sc1=0,er=R-1,ec=C-1;
        while(sr<=er && sc1<=ec)   
        {
            //top
            for(int i=sc1;i<=ec;i++)
            {
                System.out.print(arr[sr][i]+" ");
            }
            sr++;
            //right
            for(int i=sr;i<=er;i++)
            {
                System.out.print(arr[i][ec]+" ");
            }
            ec--;
            //bottom
            if(sr<=er)
            {
                for(int i=ec;i>=sc1;i--)
                {
                    System.out.print(arr[er][i]+" ");
                }
                er--;
            }
            //left
            if(sc1<=ec)
            {
                for(int i=er;i>=sr;i--)
                {
                    System.out.print(arr[i][sc1]+" ");
                }
                sc1++;
            }
        }
       sc.close();
    }
    
}
