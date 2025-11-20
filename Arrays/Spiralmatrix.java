package Arrays;
public class Spiralmatrix {
    public static void main(String[] args) {
        int n= 4;
        int num=n;
        int size = n*2-1;
        int start=0,end=size-1;
        int[][] arr = new int[size][size];
        while(start<=end)
        {
            for(int i=start;i<=end;i++)
            {
                for(int j=start;j<=end;j++)
            {
                if(i==start ||i==end||j==start||j==end)
                {
                    arr[i][j]=num;
                }
            }
            }
            start++;
            end--;
           num--; 
        }
        for( int i=0;i<=size-1;i++)
        {
            for(int j=0;j<=size-1;j++)
            {

                System.out.print(arr[i][j]);       
                 }
                  System.out.println();
        }
    }
}
