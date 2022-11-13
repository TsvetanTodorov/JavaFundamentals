package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {

        List<Student> studentsList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] inputStudent = input.split(" ");
            Student student = new Student(inputStudent[0], inputStudent[1], Integer.parseInt(inputStudent[2]), inputStudent[3]);
            studentsList.add(student);
            input = scanner.nextLine();
        }

        String targetCity = scanner.nextLine();

//        for (int i = 0; i <= studentsList.size() - 1; i++) {
//            Student currentStudent = studentsList.get(i);
//            if (currentStudent.hometown.equals(targetCity)) {
//                System.out.printf("%s %s is %d years old%n", currentStudent.firstName, currentStudent.lastName,
//                        currentStudent.age);
//            }
//        }

        for (Student currentStudent : studentsList) { //
            if (currentStudent.hometown.equals(targetCity)) {
                System.out.printf("%s %s is %d years old%n", currentStudent.firstName, currentStudent.lastName,
                        currentStudent.age);
            }
        }

//        List<Integer> myNumbers = new ArrayList<>();
//        myNumbers.add(10);
//        myNumbers.add(5);
//        myNumbers.add(2);
//        myNumbers.add(1);
//
//        for (Integer currentNumber : myNumbers) {
//            System.out.println(currentNumber);
//        }


    }

    public static class Student {
        public String firstName;
        public String lastName;
        public int age;
        public String hometown;

        public Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }
    }
}
