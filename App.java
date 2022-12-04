import animal.*;
import cheval.*;

public class App {
    public static void main(String[] args) {
        Toutou cleps1 = new Toutou("Chakaplus", 4, 1.70);
        // Toutou cleps2 = new Toutou();
        cleps1.afficheInfo();
        System.out.println(cleps1.getAge());
        Toutou cleps2 = new Toutou("felix", 2);
        cleps2.afficheInfo();
        Toutou cleps3 = new Toutou("jetki");
        cleps3.afficheInfo();

        Horse hr = new Horse("Dior", 18, 140);
        hr.move();

        Pegasus pg = new Pegasus("Pege", 25, 180, 250);
        pg.move();
        pg.fly();
    }
}