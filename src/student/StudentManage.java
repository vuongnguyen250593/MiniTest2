package student;

import java.util.Arrays;
import java.util.Comparator;

public class StudentManage {
    private Student[] students;
    private static int index = 0;

    public StudentManage() {

    }

    public StudentManage(Student[] students) {
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
        StudentManage.index = index;
    }

    public void displayAllStudent() {
        for (Student student: students) {
            if(student != null) {
                System.out.println(student);
            }
        }
        System.out.println("--------------------");
    }

    public void displayMaxScore() {
        double maxScore = students[0].getAverageScore();
        Student s = students[0];
        for (Student student: students) {
            if (student != null && student.getAverageScore() > maxScore) {
                maxScore = student.getAverageScore();
                s = student;
            }
        }
        System.out.println(s);
        System.out.println("--------------------");
    }

    public void displayMinScore() {
        double minScore = students[0].getAverageScore();
        Student s = students[0];
        for (Student student: students) {
            if (student != null && student.getAverageScore() < minScore) {
                minScore = student.getAverageScore();
                s = student;
            }
        }
        System.out.println(s);
        System.out.println("--------------------");
    }

    public void displayByGender(String gender) {
        for (Student student: students) {
            if (student != null && student.getGender().equals(gender)) {
                System.out.println(student);
            }
        }
        System.out.println("--------------------");
    }

    public void searchByName(String name) {
        for (Student student: students) {
            if (student != null && student.getName().equals(name)) {
                System.out.println(student);
            }
        }
        System.out.println("--------------------");
    }

    public void addStudent(Student student) {
        if (index == students.length) {
            students = Arrays.copyOf(students, students.length + 1);
        }
        students[index] = student;
        index++;
        System.out.println("Add succesfully");
        System.out.println("--------------------");
    }

    public void deleteStudent(String name) {
        int index = 0;
        Student[] studentList = new Student[students.length];
        for (Student student: students) {
            if (student != null && !student.getName().equals(name)) {
                studentList[index] = student;
                index++;
            }
        }
        students = studentList;
        System.out.println(" Delete Successfully");
        System.out.println("--------------------");
    }

    public void sortByAverageScore() {
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1 != null && o2 != null) {
                    if (o1.getAverageScore() < o2.getAverageScore()) {
                        return -1;
                    } else if (o1.getAverageScore() > o2.getAverageScore()) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            }
        });
    }
}
