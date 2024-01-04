import week4.enums.FillType;
import week4.shape.Circle;
import week4.shape.Rectangle;

public class MainShape {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", FillType.FILLED, 5.0);
        Rectangle rectangle = new Rectangle("Blue", FillType.NOT_FILLED, 4.0, 7.0);

        System.out.println("Circle Information:");
        circle.displayInfo();
        System.out.println();

        System.out.println("Rectangle Information:");
        rectangle.displayInfo();
    }
}
