public class App {
    public static void main(String[] args) {
        Chien cleps1 = new Chien("Chakaplus", 4, 1.70);
        // Chien cleps2 = new Chien();
        cleps1.afficheInfo();
        System.out.println(cleps1.getAge());

        Chien cleps2 = new Chien("felix", 2);
        cleps2.afficheInfo();

        Chien cleps3 = new Chien("jetki");
        cleps3.afficheInfo();
    }
}