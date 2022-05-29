public class MethodOverloading {
    public static void main(String[] args) {


        Overload o = new Overload();
        o.sum(5,4);
        o.sum(5,4,6);
        double sq = o.sum(5.4,6.3);
        System.out.println("the value of method double sum is = "+ sq);

    }
}
class Overload{
    void sum(){
        System.out.println( " there is no parameter ");
    }
    void sum(int a ,int b){
        System.out.println(" the sum of a and b is = "+ (a+b));
    }
    void sum (int a , int b , int c){
        System.out.println(" the sum of a , b and c is ="+(a+b+c));
    }
    double sum(double a,double b){
        return ((a*a)+(b*b));
    }
}