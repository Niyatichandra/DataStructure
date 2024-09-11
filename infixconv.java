import java.util.Stack;
import java.util.Scanner;
public class infixconv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //prefix(s);
        postfix(s);
    }
    public static void postfix(String s)
    {
        String p="";
        s=s+")";
        Stack<Character> st= new Stack<>();
        st.push('(');
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
               st.push(ch);
            }
            else if(Character.isDigit(ch))
            {
                p=p+ch;
            }
            else if((ch=='+'||ch=='-'||ch=='*'||ch=='/') && precedence(ch)>precedence(st.peek()))
            {
                st.push(ch);
            }
            else if(precedence(ch)<=precedence(st.peek()))
            {
                while(st.peek()!='(')
                    p=p+st.pop();
                st.pop();
            }



        }
        System.out.println(p);

    }
    public static int precedence(char ch)
    {
        if(ch=='+')
            return 1;
        else if(ch=='-')
            return 1;
        else if(ch=='*')
            return 2;
        else if(ch=='/')
            return 2;
        else
            return 0;
    }
}
