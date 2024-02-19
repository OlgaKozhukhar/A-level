package ua.kozhukhar.hw13;

public class MaxLiftingCapacity {
    private String unit;
    private int value;

    public MaxLiftingCapacity(String unit, int value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "MaxLiftingCapacity{" +
                "unit='" + unit + '\'' +
                ", value=" + value +
                '}';
    }
}
