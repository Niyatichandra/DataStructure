import javax.swing.*;
import java.util.Scanner;
public class powlog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base and exponent");
        int n = sc.nextInt();
        int x = sc.nextInt();
        int p = print(n, x);
        System.out.println(p);

    }

    public static int print(int n, int x) {
        if (x % 2 == 0) {
            if (x == 0)
                return 1;
            else
                return print(n, x / 2) * print(n, x / 2);

        } else {
            if (x == 0)
                return 1;
            else

                return print(n, x / 2) * print(n, x / 2) * n;
        }
    }
}


