import java.util.Scanner;
public class stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        stair(n, "");

    }

    public static void stair(int n, String path) {
        if (n < 0)
            return;
        if (n == 0) {
            System.out.println(path);
            return;
        }
        stair(n - 1, path + "1");
        stair(n - 2, path + "2");
        stair(n - 3, path + "3");
    }
}


