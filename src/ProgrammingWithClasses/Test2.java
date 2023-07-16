package ProgrammingWithClasses;

public class Test2 {
    private int variable1;
    private String variable2;

    public Test2(int variable1, String variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    public Test2() {
        this.variable1 = 0;
        this.variable2 = "";
    }

    public void setVariable1(int value) {
        this.variable1 = value;
    }

    public void setVariable2(String value) {
        this.variable2 = value;
    }

    public int getVariable1() {
        return this.variable1;
    }

    public String getVariable2() {
        return this.variable2;
    }

    public static void main(String[] args) {
        Test2 test1 = new Test2(10, "Hello");
        System.out.println("Variable 1: " + test1.getVariable1());
        System.out.println("Variable 2: " + test1.getVariable2());

        Test2 test2 = new Test2();
        System.out.println("Variable 1: " + test2.getVariable1());
        System.out.println("Variable 2: " + test2.getVariable2());

        test2.setVariable1(5);
        test2.setVariable2("World");
        System.out.println("Variable 1: " + test2.getVariable1());
        System.out.println("Variable 2: " + test2.getVariable2());
    }
}
