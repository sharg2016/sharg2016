public class StaticInner {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        Outer1.Inner o1 = new Outer1.Inner(40,90);
        o.display();
    }


}
class Outer1 {
    int a= 20;

    void display(){
        System.out.println("the value of a is ="+a);
    }
    static class Inner{
        Inner(int x , int y){
            System.out.println("the of x and y is = "+(x+y));

        }
    }
}