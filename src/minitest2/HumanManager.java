package minitest2;

import java.util.Arrays;

public class HumanManager implements Manager{
    Student[] students;
    public static int index = 0;

    public HumanManager() {

    }

    public HumanManager(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public void displayAllStudent() {
        for (Student student: students) {
            if (student != null) {
                System.out.println(student);
            }
        }
        System.out.println("----------");
    }

    @Override
    public void displayAddStudent() {

    }

    @Override
    public void displayAddStudent(Student student) {
        if (index == students.length) {
            students = Arrays.copyOf(students, students.length+1);
        }
        students[index] = student;
        index++;
        System.out.println("Add successfully");
        System.out.println("----------");
    }

    @Override
    public void displaySearchStudent() {

    }

    @Override
    public void displaySearchStudent(String name) {
        for (Student student: students) {
            if (student != null && student.getName().equals(name)) {
                System.out.println(student);
            }
        }
        System.out.println("--------------------");
    }

    @Override
    public void displayDeleteStudent() {

    }

    @Override
    public void displayEditStudent() {

    }

    @Override
    public void displaySortStudent() {

    }

    @Override
    public void displayTotalScore() {

    }
}
