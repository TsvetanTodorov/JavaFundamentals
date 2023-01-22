package ObjectsAndClasses.Exercise.carSalesman;

public class Car {

    private String model;
    private Engine engine;
    private Integer weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car(String model, Engine engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public Car(String model, Engine engine, int weight) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }


    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String output = String.format("%s:%n  %s:%n    Power: %s%n    Displacement: %s%n    Efficiency: %s%n  Weight: %s%n  Color: %s",
                getModel(),
                getEngine().getModel(),
                getEngine().getPower(),
                getEngine().getDisplacement() == null ? "n/a" : getEngine().getDisplacement(),
                getEngine().getEfficiency() == null ? "n/a" : getEngine().getEfficiency(),
                getWeight() == null ? "n/a" : getWeight(),
                getColor() == null ? "n/a" : getColor());
        return output;
    }
}
