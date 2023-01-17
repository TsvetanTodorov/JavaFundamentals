package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {

    static class Vehicle {
        private final String type;
        private final String model;
        private final String color;
        private final int horsepower;

        public Vehicle(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public void print() {
            System.out.printf("Type: %s%n", transformToUpperCase(this.type));
            System.out.printf("Model: %s%n", transformToUpperCase(this.model));
            System.out.printf("Color: %s%n", this.color);
            System.out.printf("Horsepower: %d%n", this.horsepower);
        }

        private String transformToUpperCase(String text) {
            return text.substring(0, 1).toUpperCase().concat(text.substring(1));
        }

    }

    static class Catalogue {
        List<Vehicle> listOfTrucks = new ArrayList<>();
        List<Vehicle> listOfCars = new ArrayList<>();

        public void addVehicle(Vehicle vehicle) {
            if (vehicle.type.equals("car")) {
                listOfCars.add(vehicle);
            } else {
                listOfTrucks.add(vehicle);
            }
        }

        public void printVehicleDetails(String model) {
            for (Vehicle vehicle : listOfCars) {
                if (vehicle.model.equals(model)) {
                    vehicle.print();
                }
            }
            for (Vehicle vehicle : listOfTrucks) {
                if (vehicle.model.equals(model)) {
                    vehicle.print();
                }
            }

        }

        public void printAverageVehiclesHorsepower() {
            System.out.printf("Cars have average horsepower of: %.2f.%n", calculateAverageCarsHorsepower());
            System.out.printf("Trucks have average horsepower of: %.2f.", calculateAverageTrucksHorsepower());
        }

        private boolean isEmpty(List<Vehicle> vehicleList) {
            return vehicleList.isEmpty();
        }

        private double calculateAverageTrucksHorsepower() {
            int totalHorsepower = 0;
            if (isEmpty(listOfTrucks)) {
                return 0;
            }
            for (Vehicle vehicle : listOfTrucks) {
                totalHorsepower += vehicle.horsepower;
            }
            return (double) totalHorsepower / listOfTrucks.size();
        }

        private double calculateAverageCarsHorsepower() {
            int totalHorsepower = 0;
            if (isEmpty(listOfCars)) {
                return 0;
            }
            for (Vehicle vehicle : listOfCars) {
                totalHorsepower += vehicle.horsepower;
            }
            return (double) totalHorsepower / listOfCars.size();
        }


    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Catalogue catalogue = new Catalogue();

        while (!command.equals("End")) {

            Vehicle vehicle = createVehicle(command);

            catalogue.addVehicle(vehicle);

            command = scanner.nextLine();
        }

        command = scanner.nextLine();

        while (!command.equals("Close the Catalogue")) {

            catalogue.printVehicleDetails(command);

            command = scanner.nextLine();
        }

        catalogue.printAverageVehiclesHorsepower();

    }

    public static Vehicle createVehicle(String command) {
        String typeOfVehicle = command.split("\\s+")[0];
        String modelOfVehicle = command.split("\\s+")[1];
        String colorOfVehicle = command.split("\\s+")[2];
        int horsepowerOfVehicle = Integer.parseInt(command.split("\\s+")[3]);

        return new Vehicle(typeOfVehicle, modelOfVehicle, colorOfVehicle, horsepowerOfVehicle);
    }


}
