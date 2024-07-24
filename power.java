import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        System.out.println("enter base and exponent");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int p = pow(n, x);
        System.out.println(p);

    }

    public static int pow(int n, int x) {

        if (x == 0)
            return 1;
        else {

            return pow(n, x - 1) * n;
        }


    }
}




