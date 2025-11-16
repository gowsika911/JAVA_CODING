package classesAndobject;
class large{
    int arr[];
    public int largest(int arr[])
    {
        int max =arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}

public class largestElement {
    public static void main(String[] args) {
        large l1 =new large();
        int arr[]= {3,5,7,2,8};
        System.out.println("Largest element is:"+l1.largest(arr));

    }    
}
