public class Inherit {
    public static void main(String[] args) {
        Super ob = new Super();
        Sub  ob1 = new Sub();
        ob.i = 10;
        ob.j = 20;
        ob1.i = 11;
        ob1.j = 22;
        ob1.k = 33;
        ob.show();
        ob1.showk();
        ob1.add();
     }
}
class  Super{
    int i ;
    int j;

    void show (){
        System.out.println("value of i and j is ="+ i + " " + j);
    }

}

class Sub extends Super{
    int k ;

    void showk(){
        System.out.println("the value of k is = "+ k);
    }

    void add(){
        System.out.println("the sum of i j and k is = " +(i+j+k));
    }
}
