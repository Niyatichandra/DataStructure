import java.util.Scanner;
public class encodings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        encodings(str, "");

    }

    public static void encodings(String ques, String asf) {
        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        } else if (ques.length() == 1) {
            char ch = ques.charAt(0);
            if (ch == 0)
                return;
            else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                System.out.println(asf + code);
            }
        } else {
            char ch = ques.charAt(0);
            String roq = ques.substring(1);
            if (ch == 0)
                return;

            else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                encodings(roq, asf + code);
            }
        }

        String ch12 = ques.substring(0, 2);
        String roq12 = ques.substring(2);
        int ch12v = Integer.parseInt(ch12);
        if (ch12v <= 26) {
            char code = (char) ('a' + ch12v - 1);
            encodings(roq12, asf + code);
        }

    }
}





