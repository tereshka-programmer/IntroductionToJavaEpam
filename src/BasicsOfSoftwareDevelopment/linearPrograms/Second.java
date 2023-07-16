package BasicsOfSoftwareDevelopment.linearPrograms;

public class Second {

    public static void main(String[] args) {
        double a = 2.5;
        double b = 1.8;
        double c = 3.2;

        double result = b + Math.sqrt(b) / (2 + 4 * a * c / (2 * a) - Math.pow(a, 3)) + c + b / (-2);

        System.out.println("Значение выражения: " + result);
    }

}
