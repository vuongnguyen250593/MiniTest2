package student1;

import java.util.*;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Student createStudent() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Math: ");
        double math = scanner.nextDouble();
        System.out.print("Enter Physical: ");
        double physical = scanner.nextDouble();
        System.out.print("Enter Chemistry: ");
        double chemistry = scanner.nextDouble();
        return  new Student(id, name, age,math, physical, chemistry);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student updateStudent(int id) {
        Student student = null;
        for (Student student1: students) {
            if (student1.getId() == id) {
                student = student1;
            }
        }
        if (student != null) {
            int index = students.indexOf(student);
            scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            student.setName(name);
            scanner.nextLine();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.print("Enter Math: ");
            double math = scanner.nextDouble();
            student.setMath(math);
            System.out.print("Enter Physical: ");
            double physical = scanner.nextDouble();
            student.setPhysical(physical);
            System.out.print("Enter Chemistry: ");
            double chemistry = scanner.nextDouble();
            student.setChimistry(chemistry);
            students.set(index,student);
        }
        return student;
    }

    public Student deleteStudent(int id) {
        Student student = null;
        boolean check = false;
        for (Student student1: students) {
            if (student1.getId() == id) {
                check = true;
                student = student1;
                students.remove(student);
            }
        }
        if (!check) {
            System.out.println("The ID is not existence");
        }
        return student;
    }

    public Student searchById(int id) {
        Student student = null;
        boolean check = false;
        for (Student student1: students) {
            if (student1.getId() == id) {
                student = student1;
                check = true;
            }
        }
        if (!check) {
            System.out.println("The ID is not existence");
        }
        return student;
    }

    public void sortAverageScore() {
        students.sort(new Comparator<Student>() {
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

    public double maxScore() {
        double maxStudent = students.get(0).getAverageScore();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageScore() > maxStudent) {
                maxStudent = students.get(i).getAverageScore();
            }
        }
        return maxStudent;
    }

    public void writeToFile() {
    }

    public void readFromaFile() {

    }
}
