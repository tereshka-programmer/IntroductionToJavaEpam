package ProgrammingWithClasses;

import java.awt.*;

public class Triangle {
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;

    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    public double getPerimeter() {
        double side1 = vertex1.distanceTo(vertex2);
        double side2 = vertex2.distanceTo(vertex3);
        double side3 = vertex3.distanceTo(vertex1);
        return side1 + side2 + side3;
    }

    public double getArea() {
        double side1 = vertex1.distanceTo(vertex2);
        double side2 = vertex2.distanceTo(vertex3);
        double side3 = vertex3.distanceTo(vertex1);
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public Point getCentroid() {
        double centroidX = (vertex1.getX() + vertex2.getX() + vertex3.getX()) / 3;
        double centroidY = (vertex1.getY() + vertex2.getY() + vertex3.getY()) / 3;
        return new Point(centroidX, centroidY);
    }

    public static void main(String[] args) {
        Point vertex1 = new Point(0, 0);
        Point vertex2 = new Point(0, 4);
        Point vertex3 = new Point(3, 0);

        Triangle triangle = new Triangle(vertex1, vertex2, vertex3);

        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Centroid: " + triangle.getCentroid());
    }
}
