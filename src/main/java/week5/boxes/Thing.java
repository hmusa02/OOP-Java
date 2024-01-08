package week5.boxes;

public class Thing {
    private double weight;

    public Thing(double weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight cannot be negative!");
        }
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Thing thing = (Thing) obj;
        return Double.compare(thing.weight, weight) == 0;
    }
}
