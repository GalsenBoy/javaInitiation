package exo;

public class Cylindre {
    static double aireVolume(double rayon, double hauteur) {
        double aire = rayon * rayon * 3.14;
        System.out.println("L'air vaut" + " " + aire);
        double volume = aire * hauteur;
        return volume;
    }

    public static void main(String[] args) {
        System.out.println("La volume vaut" + " " + aireVolume(5, 15));
    }
}
