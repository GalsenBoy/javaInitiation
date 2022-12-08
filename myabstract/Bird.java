package myabstract;

public class Bird extends LivingSpecies implements Fly {
    /**
     * @param walk   La manière dont marche l'Oiseau
     * @param age    L'âge de l'Oiseau
     * @param taille La taille de l'Oiseau
     * @param name   Le nom de l'Oiseau
     */
    public Bird(int age, double taille, String name) {
        super("lent", age, taille, name);
    }

    public void walk() {

    }

    public void sleep() {
        StringBuilder sl = new StringBuilder().append("Je dois 1 heures par jour");
        System.out.println(sl);
    };

    public void fly(int speed) {
        StringBuilder fl = new StringBuilder().append("Je vole à une vitesse de ").append(speed);
        System.out.println(fl);
    }
}
