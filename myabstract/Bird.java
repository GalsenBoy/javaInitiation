package myabstract;

public class Bird extends LivingSpecies implements Fly {
    /**
     * @param walk   La manière dont marche le Tigre
     * @param age    L'âge du Tigre
     * @param taille La taille du Tigre
     * @param name   Le nom du Tigre
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
