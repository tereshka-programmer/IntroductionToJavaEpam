package BasicsOfSoftwareDevelopment.Whiles;

public class Six {

    public static void main(String[] args) {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println("Символ: " + c + ", Численное обозначение: " + (int) c);
        }

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println("Символ: " + c + ", Численное обозначение: " + (int) c);
        }

        for (char c = '0'; c <= '9'; c++) {
            System.out.println("Символ: " + c + ", Численное обозначение: " + (int) c);
        }
    }

}
