package Algoritmization.decompozition;

public class Nine {

    public static void main(String[] args) {
        double x = 5.0;
        double y = 7.0;
        double z = 6.0;
        double t = 4.0;

        double area = calculateQuadrilateralArea(x, y, z, t);
        System.out.println("Площадь четырехугольника: " + area);
    }

    public static double calculateQuadrilateralArea(double x, double y, double z, double t) {
        double rectangleArea = x * y; // Площадь прямоугольника
        double triangleArea = 0.5 * z * t; // Площадь треугольника
        double quadrilateralArea = rectangleArea + triangleArea; // Площадь четырехугольника
        return quadrilateralArea;
    }

}
