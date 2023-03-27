package FinalExamPrep;

import java.util.*;

public class NeedForSpeed {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> carsMap = new LinkedHashMap<>();

        int countCars = Integer.parseInt(scanner.nextLine());

        for (int car = 0; car < countCars; car++) {
            String[] data = scanner.nextLine().split("\\|");
            String carModel = data[0];
            int mileage = Integer.parseInt(data[1]);
            int fuel = Integer.parseInt(data[2]);

            carsMap.putIfAbsent(carModel, new ArrayList<>());
            carsMap.get(carModel).add(0, mileage);
            carsMap.get(carModel).add(1, fuel);
        }


        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            if (input.contains("Drive")) {
                String car = input.split(" : ")[1];
                int distance = Integer.parseInt(input.split(" : ")[2]);
                int consumedFuel = Integer.parseInt(input.split(" : ")[3]);

                int currentFuel = carsMap.get(car).get(1);
                int currentKm = carsMap.get(car).get(0);
                if (currentFuel >= consumedFuel) {
                    carsMap.get(car).set(1, currentFuel - consumedFuel);
                    carsMap.get(car).set(0, currentKm + distance);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n",
                            car, distance, consumedFuel);
                } else {
                    System.out.println("Not enough fuel to make that ride");
                }

                if (carsMap.get(car).get(0) >= 100000) {
                    System.out.println("Time to sell the " + car + "!");
                    carsMap.remove(car);
                }

            } else if (input.contains("Refuel")) {
                String carToRefuel = input.split(" : ")[1];
                int tankToRefuel = Integer.parseInt(input.split(" : ")[2]);

                int currentFuel = carsMap.get(carToRefuel).get(1);
                if (currentFuel + tankToRefuel > 75) {
                    carsMap.get(carToRefuel).set(1, 75);
                    System.out.printf("%s refueled with %d liters\n", carToRefuel, 75 - currentFuel);
                } else {
                    carsMap.get(carToRefuel).set(1, currentFuel + tankToRefuel);
                    System.out.printf("%s refueled with %d liters\n", carToRefuel, tankToRefuel);
                }

            } else if (input.contains("Revert")) {
                String carToRevert = input.split(" : ")[1];
                int kmRevert = Integer.parseInt(input.split(" : ")[2]);
                int currentKm = carsMap.get(carToRevert).get(0);

                int kmAfterRevert = currentKm - kmRevert;

                if (kmAfterRevert < 10000) {
                    kmAfterRevert = 10000;
                } else {
                    System.out.printf("%s mileage decreased by %d kilometers\n", carToRevert, kmRevert);
                }

                carsMap.get(carToRevert).set(0, kmAfterRevert);
            }
            input = scanner.nextLine();
        }

        carsMap.entrySet().forEach(entry -> {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n",
                    entry.getKey(),
                    entry.getValue().get(0),
                    entry.getValue().get(1));
        });
    }
}
