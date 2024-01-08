package week5.boxes;

import week5.boxes.Thing;
import week5.storage.Box;

public class BlackHoleBox extends Box {
    public BlackHoleBox() {
        super(Double.MAX_VALUE);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }

    @Override
    public void add(Thing thing) {

    }
}
