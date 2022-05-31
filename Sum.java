public class Sum {
    public static void main(String[] args) {
        Addition a = new Addition();
        Jodna b = new Jodna();
        b.add(10,20);

    }
}

class Addition {

    void add(int a, int b) {
        System.out.println("the sum of a and b is " + (a + b));
    }

}
class Jodna extends Addition{
    void add(int a,int b){
        System.out.println("sum of a,b,c is " + (a+b) );
    }
}
