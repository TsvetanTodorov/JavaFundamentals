package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class Student {

        private String firstName;
        private String lastName;
        private double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return this.grade;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());
        List<Student> listOfStudents = new ArrayList<>();

        for (int i = 1; i <= studentsCount; i++) {

            String studentInformation = scanner.nextLine();

            String firstName = studentInformation.split(" ")[0];
            String lastName = studentInformation.split(" ")[1];
            double grade = Double.parseDouble(studentInformation.split(" ")[2]);

            Student currentStudent = new Student(firstName, lastName, grade);
            listOfStudents.add(currentStudent);
        }

        listOfStudents.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student : listOfStudents) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());

        }


    }
}
