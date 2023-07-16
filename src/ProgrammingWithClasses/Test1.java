package ProgrammingWithClasses;

public class Test1 {
    private int variable1;
    private int variable2;

    public Test1(int variable1, int variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    public void printVariables() {
        System.out.println("Variable 1: " + variable1);
        System.out.println("Variable 2: " + variable2);
    }

    public void setVariable1(int value) {
        variable1 = value;
    }

    public void setVariable2(int value) {
        variable2 = value;
    }

    public int getVariable1() {
        return variable1;
    }

    public int getVariable2() {
        return variable2;
    }

    public int calculateSum() {
        return variable1 + variable2;
    }

    public int findMax() {
        return Math.max(variable1, variable2);
    }

    public static void main(String[] args) {
        Test1 test = new Test1(5, 10);
        test.printVariables();

        test.setVariable1(7);
        test.setVariable2(3);
        test.printVariables();

        int sum = test.calculateSum();
        System.out.println("Sum: " + sum);

        int max = test.findMax();
        System.out.println("Max: " + max);
    }
}
