public class Point {
    public double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double euclideanDistance(Point p) {
        double x = Math.pow(this.x - p.x, 2);
        double y = Math.pow(this.y - p.y, 2);
        return Math.sqrt(x + y);
    }

    @Override
    public String toString() {
        return "(" + this.x +", " + this.y + ")";
    }

    public static double euclideanDistance(Point p, Point q) {
        double x = Math.pow(p.x - q.x, 2);
        double y = Math.pow(p.y - q.y, 2);
        return Math.sqrt(x + y);
    }

    public static Point fromString(String point) {
        String[] xy = point.replaceAll("[\\[\\](){}]", "").split(",");
        return new Point(Double.parseDouble(xy[0]), Double.parseDouble(xy[1]));
    }
}