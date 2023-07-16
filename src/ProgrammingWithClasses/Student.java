package ProgrammingWithClasses;

public class Student {
    private String fullName;
    private int groupNumber;
    private int[] grades;

    public Student(String fullName, int groupNumber, int[] grades) {
        this.fullName = fullName;
        this.groupNumber = groupNumber;
        this.grades = grades;
    }

    public String getFullName() {
        return fullName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getGrades() {
        return grades;
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Ivan Petrov", 1, new int[]{9, 10, 9, 9, 10});
        students[1] = new Student("Maria Sidorova", 2, new int[]{8, 9, 9, 10, 9});
        students[2] = new Student("Alex Ivanov", 1, new int[]{10, 9, 10, 10, 9});
        students[3] = new Student("Elena Smirnova", 3, new int[]{9, 10, 9, 10, 10});
        students[4] = new Student("Sergey Volkov", 2, new int[]{9, 9, 10, 10, 9});
        students[5] = new Student("Olga Kuznetsova", 3, new int[]{10, 10, 10, 10, 10});
        students[6] = new Student("Dmitry Fedorov", 1, new int[]{9, 9, 9, 9, 9});
        students[7] = new Student("Anna Popova", 2, new int[]{9, 10, 9, 10, 10});
        students[8] = new Student("Vladimir Ivanov", 3, new int[]{10, 10, 10, 9, 10});
        students[9] = new Student("Natalia Petrova", 1, new int[]{9, 10, 10, 9, 9});

        System.out.println("Students with grades 9 or 10:");
        for (Student student : students) {
            boolean allHighGrades = true;
            for (int grade : student.getGrades()) {
                if (grade < 9) {
                    allHighGrades = false;
                    break;
                }
            }
            if (allHighGrades) {
                System.out.println("Full Name: " + student.getFullName() + ", Group Number: " + student.getGroupNumber());
            }
        }
    }
}
