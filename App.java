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

        LivingSpecies[] ls = new LivingSpecies[5];
        ls[0] = new Tiger(3, 2.5, "Baguerra");
        ls[1] = new Tiger("rapide");
        ls[2] = new Monkey(10, 1.14, "Luffy");
        ls[3] = new Bird(7, 0.7, "Luci");
        ls[4] = new Eagle(13, 1.20, "King");

        Fly[] fl = { new Bird(0, 0, null), new Eagle(0, 0, null) };
        // ls[0].whoIam();
        // ls[1].whoIam();
        // ls[2].whoIam();
        // ls[3].whoIam();
        // ls[4].whoIam();
        fl[0].fly(50);
        fl[1].fly(95);
        for (int i = 0; i < ls.length; i++) {
            ls[i].whoIam();
        }
    }
}