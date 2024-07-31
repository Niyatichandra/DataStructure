import java.util.Stack;
public class Stackex1 {
    public static int topElement(Stack<Integer> s)
    {
        return s.peek();
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        System.out.println(topElement(s));
    }
}
