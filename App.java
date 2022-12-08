import animal.*;
import cheval.*;
import myabstract.*;

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

        Tiger tg = new Tiger(3, 2.5, "Baguerra");
        tg.whoIam();

        Tiger tg2 = new Tiger("rapide");
        tg2.whoIam();

        Monkey mk = new Monkey(10, 1.14, "Luffy");
        mk.whoIam();

        Bird br = new Bird(7, 0.7, "Luci");
        br.fly(50);
        br.whoIam();

        Eagle eg = new Eagle(13, 1.20, "King");
        eg.fly(95);
        eg.whoIam();
    }
}