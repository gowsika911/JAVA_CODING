package Arrays;
import java.util.Scanner;
public class twoD {
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
        //primary diagonal
        System.out.println("Primary  diagonal");
        for(int i =0;i<R;i++)
        {
            System.out.println(arr[i][i]);
        }
        System.out.println("-------------------------------------------------");
        //secondary diagonal
        System.out.println("secondary diagonal");
        for(int i =0;i<R;i++)
        {
            System.out.println(arr[i][R-1-i]);
        }
        sc.close();
    }
}
