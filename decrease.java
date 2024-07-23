import java.util.Scanner;
public class decrease {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dec(n);
    }
    public static void dec(int n)
    {
        if(n<1)
            return;
        System.out.println(n);
        dec(n-1);
    }
}
