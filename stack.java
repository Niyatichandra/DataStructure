import java.util.Scanner;
class Stack {
    static  int MAX = 1000;
    int top=-1;
    int a[] = new int[MAX];
    void push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println(" Overflow Condition");

        }
        else {
            a[++top] = x;
         }
    }

    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }

    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }

    void print(){
        for(int i = top;i>-1;i--){
            System.out.print(" "+ a[i]);
        }
    }
}

// Driver code
class Main {
    public static void main(String args[])
    {
        int b[]=new int[1000];
        Scanner sc=new Scanner(System.in);
        Stack s = new Stack();
        System.out.println("enter size of array");
        int m=sc.nextInt();
        for(int i=0;i<m;i++)
        {
             b[i]=sc.nextInt();
            s.push(b[i]);
        }
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
    }
}
