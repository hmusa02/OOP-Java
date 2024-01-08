package week5.boxes;

import week5.boxes.Thing;
import week5.storage.Box;

public class MaxWeightBox extends Box {
    private double maxWeight;

    public MaxWeightBox(double maxWeight) {
        super(maxWeight);
        this.maxWeight = maxWeight;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }

    @Override
    public void add(Thing thing) {

    }
}
