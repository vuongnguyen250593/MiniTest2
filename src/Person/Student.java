package Person;

public class Student extends Person {
    private double mathScore;
    private double physicalScore;
    private double chemistryScore;

    public Student() {

    }

    public Student(double mathScore, double physicalScore, double chemistryScore) {
        this.mathScore = mathScore;
        this.physicalScore = physicalScore;
        this.chemistryScore = chemistryScore;
    }

    public Student(int id, String name, int age, double mathScore, double physicalScore, double chemistryScore) {
        super(id, name, age);
        this.mathScore = mathScore;
        this.physicalScore = physicalScore;
        this.chemistryScore = chemistryScore;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getPhysicalScore() {
        return physicalScore;
    }

    public void setPhysicalScore(double physicalScore) {
        this.physicalScore = physicalScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mathScore=" + mathScore +
                ", physicalScore=" + physicalScore +
                ", chemistryScore=" + chemistryScore +
                '}';
    }
}
