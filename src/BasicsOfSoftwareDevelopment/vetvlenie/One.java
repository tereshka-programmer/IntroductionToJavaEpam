package BasicsOfSoftwareDevelopment.vetvlenie;

public class One {

    public static void main(String[] args) {
        int angle1 = 45; // Замените значение на нужное
        int angle2 = 90; // Замените значение на нужное

        int angle3 = 180 - angle1 - angle2; // Вычисляем третий угол треугольника

        boolean triangleExists = (angle3 > 0); // Проверяем существование треугольника

        boolean rightTriangle = (angle1 == 90 || angle2 == 90 || angle3 == 90); // Проверяем, является ли треугольник прямоугольным

        if (triangleExists) {
            System.out.println("Треугольник существует.");
            if (rightTriangle) {
                System.out.println("Треугольник является прямоугольным.");
            } else {
                System.out.println("Треугольник не является прямоугольным.");
            }
        } else {
            System.out.println("Треугольник не существует.");
        }
    }

}
