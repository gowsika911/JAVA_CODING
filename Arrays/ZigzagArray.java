package Arrays;

import java.util.Scanner;

public class ZigzagArray {
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
        for(int i=0;i<R;i++)
        {
            if(i%2==0)
            {
            for(int j=0;j<C;j++)
            {
                System.out.print(arr[i][j]);
            }
            }  
            else
             for(int j=C-1;j>=0;j--)
            {
            System.out.print(arr[i][j]);
            }
             System.out.println();
            }
            sc.close();
        }
    }
    

