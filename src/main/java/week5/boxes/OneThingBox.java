package week5.boxes;

import week5.boxes.Thing;
import week5.storage.Box;

public class OneThingBox extends Box {
    private boolean hasThing;

    public OneThingBox() {
        super(Double.MAX_VALUE);
        this.hasThing = false;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }

    @Override
    public void add(Thing thing) {
        if (!hasThing) {
            hasThing = true;
        }
    }
}
