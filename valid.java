import java.util.Stack;
import java.util.Scanner;
public class valid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character> st=new Stack<>();
        Stack<Character> at=new Stack<>();
        char r;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            st.push(ch);
        }
        if(st.size()==0)
        {
            System.out.println(st.size());
        }
        else {

            while(st.size()!=0)
            {
                char q=st.pop();
                if(q==')')
                {
                    if(st.peek()=='(')
                    {
                      r=st.pop();
                      at.push(q);
                      at.push(r);
                    }
                }

            }
        }

        System.out.println(at.size());
        }


    }

