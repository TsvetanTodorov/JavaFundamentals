package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {

    static class Person {
        private String firstName;
        private String ID;
        private int age;

        public Person(String firstName, String ID, int age) {
            this.firstName = firstName;
            this.ID = ID;
            this.age = age;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getID() {
            return this.ID;
        }

        public int getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Person> listOfPersons = new ArrayList<>();

        while (!command.equals("End")) {

            String firstName = command.split("\\s+")[0];
            String ID = command.split("\\s+")[1];
            int age = Integer.parseInt(command.split("\\s+")[2]);

            Person currentPerson = new Person(firstName, ID, age);
            listOfPersons.add(currentPerson);

            command = scanner.nextLine();
        }

        listOfPersons.sort(Comparator.comparing(Person::getAge));

        for (Person person : listOfPersons) {
            System.out.printf("%s with ID: %s is %d years old.%n", person.getFirstName(),
                    person.getID(), person.getAge());
        }

    }
}
