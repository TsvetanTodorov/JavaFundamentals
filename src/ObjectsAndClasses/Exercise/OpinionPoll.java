package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    static class Person {

        private String name;
        private int age;


        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Person> listOfPeople = new ArrayList<>();

        int countPersons = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countPersons; i++) {
            String[] personalInformation = scanner.nextLine().split("\\s+");

            String personName = personalInformation[0];
            int personAge = Integer.parseInt(personalInformation[1]);

            Person currentPerson = new Person(personName, personAge);

            if (personAge > 30) {
                listOfPeople.add(currentPerson);
            }
        }

        listOfPeople.sort(Comparator.comparing(Person::getName));

        for (Person person : listOfPeople) {
            System.out.println(person.getName() + " - " + person.getAge());
        }


    }
}
