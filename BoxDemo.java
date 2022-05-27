public class BoxDemo {
    public static void main(String[] args) {
        Box s = new Box();
        s.setDimension(10.0,11.22,15.5);
        double vol = s.volume();
        System.out.println(" the volume of box is = " + vol);
    }
}
class Box{
    double Width;
    double Height;
    double depth;

    double volume(){
        return Width*Height*depth ;
    }

    void setDimension(double w , double h, double d){
        Width = w;
        Height = h;
        depth = d;
    }
}

