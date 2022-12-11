package myabstract;

public class Tiger extends LivingSpecies {

    // private String scream;

    /**
     * 
     * @param walk   La manière dont marche le Tigre
     * @param age    L'âge du Tigre
     * @param taille La taille du Tigre
     * @param name   Le nom du Tigre
     */
    public Tiger(int age, double taille, String name) {
        super("rapide", age, taille, name);
        // this.scream = "rugi";
    }

    /**
     * 
     * @param walk   La manière dont marche le Tigre
     * @param taille La taille du Tigre
     * @param name   Le nom du Tigre
     */
    public Tiger(String walk, double taille, String name) {
        super(walk, 3, taille, name);
    }

    /**
     * 
     * @param walk   La manière dont marche le Tigre
     * @param taille La taille du Tigre
     */
    public Tiger(String walk, double taille) {
        super(walk, 3, taille, "Gringer");
    }

    /**
     * 
     * @param walk
     */
    public Tiger(String walk) {
        super(walk, 3, 2.07, "Gringer");
    }

    public void walk() {

    }

    public void sleep() {
        StringBuilder sl = new StringBuilder().append("Je dois 3 heures par jour");
        System.out.println(sl);
    };
}
