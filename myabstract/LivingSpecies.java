package myabstract;

abstract public class LivingSpecies {
    protected String walk;
    protected int age;
    protected double taille;
    protected String name;

    /**
     * @param walk   La manière dont marche l'être vivant
     * @param age    L'âge de l'être vivant
     * @param taille La taile de l'être vivant
     * @param name   Le nom de l'être vivant
     */
    public LivingSpecies(String walk, int age, double taille, String name) {
        this.walk = walk;
        this.age = age;
        this.taille = taille;
        this.name = name;
    }

    public void whoIam() {
        StringBuilder wi = new StringBuilder().append("Bonjour je m'appelle ").append(this.name).append(" j'ai ")
                .append(this.age).append(" ans ").append(" et je mesure ").append(this.taille).append(" mètre(s)");
        System.out.println(wi);
    }

    abstract public void walk();

    abstract public void sleep();
}