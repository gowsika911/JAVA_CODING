package Arrays;

import java.util.Scanner;

public class matrixadiition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] a = new int[R][C];
        System.out.println("matrix1:");
        for(int i =0;i<R;i++)
        {
        
            for(int j=0;j<C;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        int[][] b = new int[R][C];
        System.out.println("matrix2:");
        for(int i =0;i<R;i++)
        {
        
            for(int j=0;j<C;j++)
            {
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println("addition of matrix:");
        //int[][] sum = new int[R][C];
        for(int i =0;i<R;i++)
        {  
            for(int j=0;j<C;j++)
            {
                System.out.print(a[i][j]+b[i][j]+" ");
               // sum[i][j]=a[i][j]+b[i][j]
            }
            System.out.println();
        }
        //System.out.println(sum[i][j])
        sc.close();
    }
}
