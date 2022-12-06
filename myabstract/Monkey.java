package myabstract;

public class Monkey extends LivingSpecies {
    /**
     * @param walk   La manière dont marche le Tigre
     * @param age    L'âge du Tigre
     * @param taille La taille du Tigre
     * @param name   Le nom du Tigre
     */
    public Monkey(int age, double taille, String name) {
        super("rapide", age, taille, name);
    }

    public void walk() {

    }

    public void sleep() {
        StringBuilder sl = new StringBuilder().append("Je dois 8 heures par jour");
        System.out.println(sl);
    };
}
