import java.util.Scanner;
public class lastindex {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter index");
        int i = sc.nextInt();
        System.out.println("enter array");
        for (int n = 0; n < i; n++)
            arr[n] = sc.nextInt();
        System.out.println("enter number to search");
        int m = sc.nextInt();
        index(m, arr, i);

    }

    public static void index(int m, int arr[], int i) {
        if (i < 0)
            return;
        if (m == arr[i])
            System.out.println(i + 1);
        else
            index(m, arr, i - 1);
    }
}


