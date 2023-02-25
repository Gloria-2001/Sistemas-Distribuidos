import java.util.*;

public class Triangle {

    private double a, b, c;

    public Triangle(double base, double height) {
        this.a = base;
        this.b = height;
        this.c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public Triangle(double base, double height, double hypotenuse) {
        this.a = base;
        this.b = height;
        this.c = hypotenuse;
    }

    public Triangle(Point a, Point b, Point c) {
        List<Point> points = new ArrayList<Point>();
        points.add(a);
        points.add(b);
        points.add(c);
        
        Collections.sort(points, new Comparator<Point>() {
            public int compare(Point p, Point q) {
                return Double.compare(p.x, q.x);
            }
        });

        this.a = Point.euclideanDistance(a, b);
        this.b = Point.euclideanDistance(a, c);
        this.c = Point.euclideanDistance(b, c);
    }

    public double getRadius() {
        return (this.a + this.b - this.c) / 2;
    }

    public static void main(String[] args) {
        if (args.length < 2 || args.length > 4) {
            System.out.println("Missing or surplus arguments");
            System.out.println("java Triangle base height");
            System.out.println("java Triangle base height hypotenuse");
            System.out.println("java Triangle \"(x1,y1)\" \"(x2,y2)\" \"(x3,y3)\"");
            return;
        }

        Triangle tri;
        if (args.length == 3) {
            if (args[0].startsWith("("))
                tri = new Triangle(Point.fromString(args[0]), Point.fromString(args[1]), Point.fromString(args[2]));
            else
                tri = new Triangle(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
        } else tri = new Triangle(Double.parseDouble(args[0]), Double.parseDouble(args[1]));

        System.out.println("Radius: " + tri.getRadius());
    }
}