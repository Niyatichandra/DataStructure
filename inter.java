import java.io.*;
public class inter {
    public static void main(String[] args) {
        Testclass t=new Testclass();
        t.display();
        System.out.println(t.a);
    }
}
interface in
{
    final int a=10;
    void display();
}
class Testclass implements in {
    public void display() {
        System.out.println("geek");
    }
}

