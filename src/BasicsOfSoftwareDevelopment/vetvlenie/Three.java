package BasicsOfSoftwareDevelopment.vetvlenie;

public class Three {

    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        int x3 = 5;
        int y3 = 6;

        boolean areCollinear = checkCollinearity(x1, y1, x2, y2, x3, y3);

        if (areCollinear) {
            System.out.println("Точки A, B и C расположены на одной прямой.");
        } else {
            System.out.println("Точки A, B и C не расположены на одной прямой.");
        }
    }

    public static boolean checkCollinearity(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Проверяем, является ли площадь треугольника равной нулю
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

}
