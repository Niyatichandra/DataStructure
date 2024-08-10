import java.util.Scanner;
public class hanoi {
    public static void main(String[] args) {
        System.out.println("enter number of discs");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        hanoi(n, t1, t2, t3);

    }

    public static void hanoi(int n, int t1, int t2, int t3) {
        if (n == 0) {
            return;
        }
        hanoi(n - 1, t1, t3, t2);
        System.out.println(n + "->" + t1 + "->" + t2);
        hanoi(n - 1, t3, t2, t1);
    }


}
