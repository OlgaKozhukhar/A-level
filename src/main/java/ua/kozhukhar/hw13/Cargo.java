package ua.kozhukhar.hw13;

public class Cargo {
    private String name;
    private String cargoClass;

    public Cargo(String name, String cargoClass) {
        this.name = name;
        this.cargoClass = cargoClass;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "name='" + name + '\'' +
                ", cargoClass='" + cargoClass + '\'' +
                '}';
    }
}
