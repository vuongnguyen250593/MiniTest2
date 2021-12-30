package student1;

public class Student extends Human {
    private double math;
    private double physical;
    private double chimistry;

    public Student() {
    }

    public Student(double math, double physical, double chimistry) {
        this.math = math;
        this.physical = physical;
        this.chimistry = chimistry;
    }

    public Student(int id, String name, int age, double math, double physical, double chimistry) {
        super(id, name, age);
        this.math = math;
        this.physical = physical;
        this.chimistry = chimistry;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysical() {
        return physical;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    public double getChimistry() {
        return chimistry;
    }

    public void setChimistry(double chimistry) {
        this.chimistry = chimistry;
    }

    public double getAverageScore() {
        return (math + physical + chimistry) / 3;
    }

    @Override
    public String toString() {
        return "Student {" + super.toString() +
                "math= " + math +
                ", physical= " + physical +
                ", chimistry= " + chimistry +
                '}';
    }
}
