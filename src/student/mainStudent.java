package student;

import java.util.Scanner;

public class mainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];
        studentManage studentManage = new studentManage(students);
        students[0] = new Student("Nguyễn",29,"Male","Hà Nội",7);
        students[1] = new Student("Quí",29,"Male","Hà Nội",6);
        students[2] = new Student("Vương",29,"Male","Hà Nội",8);
        studentManage.displayAllStudent();
        studentManage.displayMaxScore();
        studentManage.displayMinScore();
    }
}
