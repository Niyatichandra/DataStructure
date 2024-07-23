import java.util.Scanner;
public class arrev {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter index");
        int i = sc.nextInt();
        System.out.println("enter array");
        for (int n = 0; n < i; n++)
            arr[n] = sc.nextInt();
        array(arr, i);

    }

    public static void array(int arr[], int ind) {
        if (ind < 0)
            return;
        System.out.print(arr[ind]);
        array(arr, ind - 1);


    }
}


