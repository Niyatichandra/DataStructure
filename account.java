import java.util.Scanner;

class account {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    }


    public void withdrawal(int bal) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount to withdraw");
        int amt = sc.nextInt();
        if (amt > bal) {
            System.out.println("invalid ,amount greater than balance");
        } else {
            bal -= amt;
            System.out.println("amount withdrawn " + amt);
            System.out.println("enter 1 to view balance");
            int f = sc.nextInt();
            if (f == 1) {
                System.out.println(bal);
            } else {
                System.exit(0);
            }
        }

    }

    public void deposit(int bal) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount to deposit");
        int amt = sc.nextInt();
        bal += amt;
        System.out.println(bal);
    }

    public void check(int bal) {
        System.out.println("balance=" + bal);
    }
}
