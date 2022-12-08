package myabstract;

public class Eagle extends LivingSpecies implements Fly {
    /**
     * @param walk   La manière dont marche l'Aigle
     * @param age    L'âge de l'Aigle
     * @param taille La taille de l'Aigle
     * @param name   Le nom de l'Aigle
     */
    public Eagle(int age, double taille, String name) {
        super("lent", age, taille, name);
    }

    public void walk() {

    }

    public void sleep() {
        StringBuilder sl = new StringBuilder().append("Je dois 2 heures par jour");
        System.out.println(sl);
    };

    public void fly(int speed) {
        StringBuilder fl = new StringBuilder().append("Je vole à une vitesse de ").append(speed).append(" km/h");
        System.out.println(fl);
    }
}
