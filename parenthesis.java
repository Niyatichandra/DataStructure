import java.util.Stack;
public class parenthesis {
    static boolean balance(String exp)
    {
        Stack <Character> s = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char x = exp.charAt(i);
            if (x == '(' || x == '[' || x == '{')
            {
                s.push(x);
                continue;
            }
            if (s.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = s.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = s.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = s.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (s.isEmpty());
    }
    public static void main(String[] args)
    {
        String expr = "([{}])";

        // Function call
        if (balance(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}


