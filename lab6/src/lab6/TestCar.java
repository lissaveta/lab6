package lab6;

public class TestCar {
    public static void main(String[] args) {
        car c1 = new car("Audi", "A7", "3.0 55 TFSI", 4000000, 2018);
        c1.println();
        car c2 = new car("Lexus", "UX", "200", 2120000, 2018);
        c2.println();
        car c3 = new car("Ford", "Fiesta", "Mk6", 895000, 2019);
        c3.println();
    }
}
