import java.util.Scanner;
public class firstindex {
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
        index(m, arr, 0);

    }

    public static void index(int m, int[] arr, int ind) {
        if (ind == arr.length)
            return;

        if (m == arr[ind]) {

            System.out.println(ind + 1);


        } else {
            index(m, arr, ind + 1);

        }


    }
}


