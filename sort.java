import java.util.Scanner;
public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        sort(arr);

    }


    public static void sort(int[] arr) {
        int i;
        for (i = 0; i < arr.length - 1; ++i) {
            int min = i;

            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[min] > arr[j]) {
                    min = j;
                    int t = arr[min];
                    arr[min] = arr[i];
                    arr[i] = t;
                }
            }
        }

        for (i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }

}



