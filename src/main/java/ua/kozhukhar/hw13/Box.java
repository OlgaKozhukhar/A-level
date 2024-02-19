package ua.kozhukhar.hw13;

import java.time.LocalDateTime;

public class Box {
    private String from;
    private String material;
    private String color;
    private MaxLiftingCapacity maxLiftingCapacity;
    private Cargo cargo;
    private LocalDateTime deliveryDate;

    public Box(String from, String material, String color, MaxLiftingCapacity maxLiftingCapacity, Cargo cargo, LocalDateTime deliveryDate) {
        this.from = from;
        this.material = material;
        this.color = color;
        this.maxLiftingCapacity = maxLiftingCapacity;
        this.cargo = cargo;
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Box{" +
                "from='" + from + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", maxLiftingCapacity=" + maxLiftingCapacity +
                ", cargo=" + cargo +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}

