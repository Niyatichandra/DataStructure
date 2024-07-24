import java.util.Scanner;
public class target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tar = sc.nextInt();
        int n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        subset(arr, 0, "", 0, tar);

    }

    public static void subset(int[] arr, int idx, String set, int sos, int tar) {
        if (idx == arr.length) {
            if (sos == tar) {
                System.out.println(set + ".");
            }
            return;
        }
        subset(arr, idx + 1, set + arr[idx] + ",", sos + arr[idx], tar);
        subset(arr, idx + 1, set, sos, tar);
    }
}

