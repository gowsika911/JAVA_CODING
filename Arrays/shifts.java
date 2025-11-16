package Arrays;

public class shifts {
    public static void main(String[] args)
     {
        //left shift logic1
        System.out.println("left shift");
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        for(int i=0;i<5;i++){
        System.out.println(arr[i]+" ");}
        System.out.println("---------------------------------------");
        //logic 2
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=0;
        for(int i=0;i<5;i++){
        System.out.println(arr[i]+" ");}
      System.out.println("-----------------------------------------------");
      //right shift
      System.out.println("Right shift");
      int a[]={9,8,7,6,5};
      for(int j=a.length-1;j>0;j--)
        {
            a[j]=a[j-1];
        }
        a[0]=0;
        for(int i=0;i<5;i++){
        System.out.println(a[i]+" ");}
        System.out.println("---------------------------------------");


}
}
