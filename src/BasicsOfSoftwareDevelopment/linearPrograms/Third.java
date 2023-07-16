package BasicsOfSoftwareDevelopment.linearPrograms;

public class Third {

    public static void main(String[] args) {
        double x = 0.7;
        double y = 1.2;

        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x);

        System.out.println("Значение выражения: " + result);
    }

}
