package student;

public class studentManage {
    private Student[] students;
    private static int index = 0;

    public studentManage() {

    }

    public studentManage(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        studentManage.index = index;
    }

    public void displayAllStudent() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    public void displayMaxScore() {
        double maxScore = students[0].getAverageScore();
        String maxScoreStudent = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAverageScore() > maxScore) {
                maxScore = students[i].getAverageScore();
                maxScoreStudent = students[i].getName();
            }
        }
        System.out.println("The Student have max core is: " + maxScoreStudent + " with max score is: " + maxScore);
    }

    public void displayMinScore() {
        double minScore = students[0].getAverageScore();
        String minScoreStudent = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAverageScore() < minScore) {
                minScore = students[i].getAverageScore();
                minScoreStudent = students[i].getName();
            }
        }
        System.out.println("The Student have min core is: " + minScoreStudent + " with min score is: " + minScore);
    }
}
