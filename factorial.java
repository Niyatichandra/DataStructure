import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = fact(n);
        System.out.println(f);

    }

    public static int fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return n * fact(n - 1);

    }
}



