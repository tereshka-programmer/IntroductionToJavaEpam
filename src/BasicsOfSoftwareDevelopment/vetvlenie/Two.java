package BasicsOfSoftwareDevelopment.vetvlenie;

public class Two {

    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 3;
        int d = 7;

        int minAB = Math.min(a, b);
        int minCD = Math.min(c, d);
        int result = Math.max(minAB, minCD);

        System.out.println("Значение max{min(a, b), min(c, d)}: " + result);
    }

}
