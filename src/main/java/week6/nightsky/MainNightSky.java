package week6.nightsky;

public class MainNightSky {
    public static void main(String[] args) {

        NightSky nightSkyOne = new NightSky(0.1, 40, 10);
        nightSkyOne.print();
        System.out.println("Number of stars: " + nightSkyOne.starsInLastPrint());

        NightSky nightSkyTwo = new NightSky(0.2, 15, 6);
        nightSkyTwo.print();
        System.out.println("Number of stars: " + nightSkyTwo.starsInLastPrint());

    }
}
