public class StaticExample {
    public static void main(String[] args) {
        Use u = new Use();
        u.show(112);
    }
}
class Use{
    static int a = 3;
    static int b;

    static void show(int x ){
        System.out.println("the value of x is = "+x);
        System.out.println("the value of b is ="+b);
        System.out.println("the value of a is ="+a);
    }
    static {
        System.out.println("Static block executed.");
        b = a*4;
        System.out.println(a);
    }
}