import java.util.Scanner;
public class arr1 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter index");
        int i = sc.nextInt();
        System.out.println("enter array");

        for (int n = 0; n < i; ++n) {
            arr[n] = sc.nextInt();
        }

        array1(arr, i);

    }

    public static void array1(int[] arr, int ind) {
        if (ind >= 1) {
            array1(arr, ind - 1);
            System.out.print(arr[ind]);
        }
    }

}


