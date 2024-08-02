import java.util.Scanner;
public class wordscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of words");
        int now = sc.nextInt();
        String[] words = new String[now];
        for (int i = 0; i < words.length; i++)
            words[i] = sc.next();
        int nol = sc.nextInt();
        char[] letters = new char[nol];
        for (int i = 0; i < letters.length; i++)
            letters[i] = sc.next().charAt(0);
        int[] score = new int[26];
        for (int i = 0; i < score.length; i++)
            score[i] = sc.nextInt();
        if (words == null || words.length == 0 || letters == null || letters.length == 0 || score.length == 0) {
            System.out.println(00);
            return;
        }
        int[] farr = new int[score.length];
        for (char ch : letters)
            farr[ch - 'a']++;
        System.out.println(solution(words, farr, score, 0));
    }

    public static int solution(String[] words, int[] farr, int[] score, int idx) {
        if (idx == words.length)
            return 0;
        int sno = 0 + solution(words, farr, score, idx + 1);
        int sword = 0;
        String word = words[idx];
        boolean flag = true;
        for (int i = 0; i < words.length; i++) {
            char ch = word.charAt(i);
            if (farr[ch - 'a'] == 0)
                flag = false;

            farr[ch - 'a']--;
            sword += score[ch - 'a'];
        }
        int syes = 0;
        if (flag)
            syes = sword + solution(words, farr, score, idx + 1);
        return Math.max(sno, syes);
    }
}
