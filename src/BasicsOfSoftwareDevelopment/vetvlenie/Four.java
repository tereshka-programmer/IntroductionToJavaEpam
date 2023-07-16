package BasicsOfSoftwareDevelopment.vetvlenie;

public class Four {

    public static void main(String[] args) {
        int a = 10; // Ширина прямоугольного отверстия
        int b = 8;  // Высота прямоугольного отверстия

        int x = 6;  // Ширина кирпича
        int y = 9;  // Высота кирпича
        int z = 7;  // Глубина кирпича

        boolean fits = checkFitting(a, b, x, y, z);

        if (fits) {
            System.out.println("Кирпич пройдет через отверстие.");
        } else {
            System.out.println("Кирпич не пройдет через отверстие.");
        }
    }

    public static boolean checkFitting(int a, int b, int x, int y, int z) {
        // Проверяем, будут ли размеры кирпича помещаться в отверстие
        boolean fitsXY = (x <= a && y <= b);
        boolean fitsXZ = (x <= a && z <= b);
        boolean fitsYZ = (y <= a && z <= b);
        return (fitsXY || fitsXZ || fitsYZ);
    }

}
