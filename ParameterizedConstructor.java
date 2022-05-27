public class ParameterizedConstructor {
    public static void main(String[] args) {
        Box2 b = new Box2(4.25, 4, 5.5);
        double vol = b.volume();
        System.out.println("volume of box is = " + vol);
    }
}

class Box2 {
    double width;
    double height;
    double depth;

    Box2(double w, double h, double d) {
        System.out.println(" parameterized constructor called");
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}