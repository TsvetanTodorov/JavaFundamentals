package ObjectsAndClasses.Exercise.carSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int enginesCount = Integer.parseInt(scanner.nextLine());

        List<Engine> listOfEngines = new ArrayList<>();
        List<Car> listOfCars = new ArrayList<>();

        for (int i = 0; i < enginesCount; i++) {

            String[] data = scanner.nextLine().split("\\s+");

            String model = data[0];
            int power = Integer.parseInt(data[1]);
            int displacement;
            String efficiency;
            Engine engine;

            if (data.length == 4) {
                displacement = Integer.parseInt(data[2]);
                efficiency = data[3];
                engine = new Engine(model, power, displacement, efficiency);
            } else if (data.length == 3) {
                if (Character.isLetter(data[2].charAt(0))) {
                    efficiency = data[2];
                    engine = new Engine(model, power, efficiency);
                } else {
                    displacement = Integer.parseInt(data[2]);
                    engine = new Engine(model, power, displacement);
                }
            } else {
                engine = new Engine(model, power);
            }

            listOfEngines.add(engine);

        }

        int carsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < carsCount; i++) {

            String[] data = scanner.nextLine().split("\\s+");
            String model = data[0];
            Engine engine = findEngineByModel(data[1], listOfEngines);
            Car car;

            if (data.length == 4) {
                int weight = Integer.parseInt(data[2]);
                String color = data[3];
                car = new Car(model, engine, weight, color);
            } else if (data.length == 3) {
                if (Character.isLetter(data[2].charAt(0))) {
                    String color = data[2];
                    car = new Car(model, engine, color);
                } else {
                    int weight = Integer.parseInt(data[2]);
                    car = new Car(model, engine, weight);
                }
            } else {
                car = new Car(model, engine);
            }

            listOfCars.add(car);
        }

        for (Car car : listOfCars) {
            System.out.println(car.toString());
        }
    }

    private static Engine findEngineByModel(String model, List<Engine> listOfEngines) {
        for (Engine engine : listOfEngines) {
            if (engine.getModel().equals(model)) {
                return engine;
            }
        }

        return null;
    }
}
