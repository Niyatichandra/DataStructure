import java.util.Scanner;


public class abbre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        abbr(s, "", 0, 0);

    }

    public static void abbr(String s, String asf, int count, int pos) {
        if (pos == s.length()) {
            if (count == 0) {
                System.out.println(asf);
            } else {
                System.out.println(asf + count);
            }
            return;
        }

        if (count > 0)
            abbr(s, asf + count + s.charAt(pos), 0, pos + 1);
        else
            abbr(s, asf + s.charAt(pos), 0, pos + 1);

        abbr(s, asf, count + 1, pos + 1);
    }
}
