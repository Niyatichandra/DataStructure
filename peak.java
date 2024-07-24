import java.util.Scanner;
public class peak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int[] arr;
        arr=new int[n];
        for (int i = 0; i <arr.length; i++)
            arr[i] = sc.nextInt();
        peak(arr);







}
public static void peak(int arr[])
{
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i-1]<arr[i]&&arr[i+1]<arr[i])
            System.out.println(arr[i]);

    }
}
}


