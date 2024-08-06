import java.util.ArrayList;
import java.util.Scanner;
public class gold {
    static int max = 0;

    public static void fn(int[][] arr, int i, int j, boolean[][] visited, ArrayList<Integer> bag) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 0 || visited[i][j] == true)
            return;

        visited[i][j] = true;
        bag.add(arr[i][j]);
        fn(arr, i - 1, j, visited, bag);
        fn(arr, i, j + 1, visited, bag);
        fn(arr, i, j - 1, visited, bag);
        fn(arr, i + 1, j, visited, bag);
    }

    public static void getmaxgold(int[][] arr) {
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0 && visited[i][j] == false) {
                    ArrayList<Integer> bag = new ArrayList<>();
                    fn(arr, i, j, visited, bag);
                    int sum = 0;
                    for (int val : bag) {
                        sum = val;
                    }
                    if (sum > max)
                        max = sum;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        getmaxgold(arr);
        System.out.println(max);
    }
}