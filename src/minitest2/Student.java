package minitest2;

public class Student extends Human{
    private double averageScore;

    public Student() {
    }

    public Student(double averageScore) {
        this.averageScore = averageScore;
    }

    public Student(String name, int age, int id, double averageScore) {
        super(name, age, id);
        this.averageScore = averageScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "averageScore=" + averageScore +
                '}';
    }
}
