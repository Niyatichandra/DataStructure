import java.util.Stack;
import java.util.Scanner;
public class infix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Integer> operand = new Stack<>();
        Stack<Character> opt = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                operand.push(ch -'0');
            } else if (ch == '(') {
                operand.push((int)ch);
            } else if (ch == ')') {
                while (opt.peek()!='(') {
                    char optor = opt.pop();
                    int m2 = operand.pop();
                    int m1 = operand.pop();
                    int op = operation(m1, m2,optor);
                    operand.push(op);
                }
                opt.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (opt.size() > 0 && opt.peek() != '(' && precedence(ch) >= precedence(opt.peek()))
                {
                    char optor = opt.pop();
                    int m2 = operand.pop();
                    int m1 = operand.pop();
                    int op = operation(m1, m2,optor);
                    operand.push(op);
                }
                opt.push(ch);
            }


        }
        while(opt.size()!=0)
        {
            char optor=opt.pop();
            int m2=operand.pop();
            int m1=operand.pop();
            int op=operation(m1,m2,optor);
            operand.push(op);
        }
        System.out.println(operand.peek());
    }
    public static int precedence(char opt)
    {
        if(opt=='+')
            return 2;
        else if(opt=='-')
            return 2;
        else if(opt=='*')
            return 1;
        else
            return 1;
    }
    public static int operation(int m1,int m2,char opt)
    {
        if(opt=='+')
            return m1+m2;
        else if(opt=='-')
            return m1-m2;
        else if(opt=='*')
            return m1*m2;
        else
            return m2/m1;
    }
}
