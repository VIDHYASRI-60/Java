class Grade {

    int[] marks = {80, 70, 90};
    char[] grades;
    double average;

    void calculateAverage() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        average = sum / marks.length;
    }

    void calculateGrades() {
        grades = new char[marks.length];

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 80)
                grades[i] = 'A';
            else if (marks[i] >= 60)
                grades[i] = 'B';
            else
                grades[i] = 'C';
        }
    }

    void printMarks() {
        System.out.print("Marks: ");
        for (int m : marks)
            System.out.print(m + " ");
        System.out.println();
    }

    void printGrades() {
        System.out.print("Grades: ");
        for (char g : grades)
            System.out.print(g + " ");
        System.out.println();
    }

    void printAverage() {
        System.out.println("Average: " + average);
    }
}

public class Mains {
    public static void main(String[] args) {

        Grade g = new Grade();   

        g.printMarks();
        g.calculateAverage();
        g.calculateGrades();
        g.printGrades();
        g.printAverage();
    }
}
