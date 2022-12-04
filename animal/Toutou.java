package animal;

public class Toutou {
    private String name;
    private int age;
    private double taillePoile;

    /**
     * @param name        nom du chien
     * @param age         âge du chien
     * @param taillePoile taille des poils du chien
     **/
    public Toutou(String name, int age, double taillePoile) {
        this.taillePoile = taillePoile;
        this.name = name;
        this.age = age;
    }

    public Toutou(String name, int age) {
        this.name = name;
        this.age = age;
        this.taillePoile = 5.5;
    }

    public Toutou(String name) {
        this.name = name;
        this.age = 1;
        this.taillePoile = 5.5;
    }

    /**
     * Affiche les informations du chien
     */
    public void afficheInfo() {
        StringBuilder s1 = new StringBuilder().append("Je m'appelle ").append(this.name).append(" j'ai ")
                .append(this.age).append(" ans mes poils font ").append(this.taillePoile).append(" cm");
        System.out.println(s1);
    }

    /**
     * 
     * @return l'âge du chien
     */
    public int getAge() {
        return this.age;
    }

    /**
     * 
     * @param age l'âge du chien
     */
    public void setAge(int age) {
        this.age = age;
    }
}