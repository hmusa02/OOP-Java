package week5;

import week5.boxes.BlackHoleBox;
import week5.boxes.MaxWeightBox;
import week5.boxes.OneThingBox;
import week5.boxes.Thing;
import week5.national.CivilService;
import week5.national.MilitaryService;
import week5.storage.Book;
import week5.storage.Box;
import week5.storage.CD;

public class Main {
    public static void main(String[] args) {

        CivilService civilService = new CivilService();
        MilitaryService militaryService = new MilitaryService(200);

        System.out.println("Civil Service Days Left: " + civilService.getDaysLeft());
        System.out.println("Military Service Days Left: " + militaryService.getDaysLeft());

        civilService.work();
        militaryService.work();

        System.out.println("Civil Service Days Left after work: " + civilService.getDaysLeft());
        System.out.println("Military Service Days Left after work: " + militaryService.getDaysLeft());

        Book book1 = new Book("Fedor Dostojevski", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);

        Box box = new Box(10) {
            @Override
            public boolean isInTheBox(Thing thing) {
                return false;
            }

            @Override
            public void add(Thing thing) {

            }
        };

        box.add(book1);
        box.add(book2);
        box.add(cd1);

        System.out.println("Box contents: " + box);

        MaxWeightBox maxWeightBox = new MaxWeightBox(5);
        maxWeightBox.add(new Thing(3));
        maxWeightBox.add(new Thing(2));

        OneThingBox oneThingBox = new OneThingBox();
        oneThingBox.add(new Thing(4));
        oneThingBox.add(new Thing(2));

        BlackHoleBox blackHoleBox = new BlackHoleBox();
        blackHoleBox.add(new Thing(5));

        System.out.println("MaxWeightBox contents: " + maxWeightBox.isInTheBox(new Thing(3)));
        System.out.println("OneThingBox contents: " + oneThingBox.isInTheBox(new Thing(4)));
        System.out.println("BlackHoleBox contents: " + blackHoleBox.isInTheBox(new Thing(5)));
    }
}
