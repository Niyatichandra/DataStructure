import java.util.Scanner;

public class allindex {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter index");
        int i = sc.nextInt();
        System.out.println("enter array");

        int m;
        for (m = 0; m < i; ++m) {
            arr[m] = sc.nextInt();
        }

        System.out.println("enter number to search");
        m = sc.nextInt();
        index(m, arr, 0);
    }


    public static void index(int m, int[] arr, int i) {
        if (i != arr.length) {
            if (m == arr[i]) {
                System.out.println(i + 1);
                index(m, arr, i + 1);
            } else {
                index(m, arr, i + 1);
            }

        }
    }

}



