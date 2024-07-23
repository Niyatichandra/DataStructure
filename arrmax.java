import javax.swing.*;
import java.util.Scanner;
public class arrmax {
    public static void main(String[] args) {
        int[] arr=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter index");
        int i=sc.nextInt();
        System.out.println("enter array");
        for(int n=0;n<i;n++)
            arr[n]=sc.nextInt();

        System.out.println(max(arr,0));

    }

public static int max(int arr[],int ind) {

    if (ind == arr.length - 1) {
        return arr[ind];
    }

    int m = max(arr, ind + 1);
    if (arr[ind] < m) {
        return m;
    } else
        return arr[ind];

}


}




