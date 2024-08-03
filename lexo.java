import java.util.Scanner;
public class lexo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<10;i++)
                lex(i,n-1);
    }
    public static void lex(int i ,int n)
    {
        if(i>n)
            return;
        System.out.println(i);
        for(int j=0;j<10;j++)
            lex(10*i+j,n);
    }
}
