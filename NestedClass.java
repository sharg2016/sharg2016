public class NestedClass {
    public static void main(String[] args) {
        Outer ou = new Outer();
        ou.test();
    }
}

class Outer{
    int oa = 100;
    void test() {
        Inner in = new Inner();
        in.display();
    }
    class Inner {
        void display(){
            System.out.println("value of oa = "+oa);
        }
    }
}