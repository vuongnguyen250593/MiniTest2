package Human1;

public class Student extends Human{
    private double averageScore;

    public Student(double averageScore) {
        this.averageScore = averageScore;
    }

    public Student(String name, int age, String gender, String address, double averageScore) {
        super(name, age, gender, address);
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
