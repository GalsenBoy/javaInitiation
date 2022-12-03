
public class Chien {
    private String name;
    private int age;
    private double taillePoile;

    /**
     * @param name        nom du chien
     * @param age         âge du chien
     * @param taillePoile taille des poils du chien
     **/
    public Chien(String name, int age, double taillePoile) {
        this.taillePoile = taillePoile;
        this.name = name;
        this.age = age;
    }

    public Chien(String name, int age) {
        this.name = name;
        this.age = age;
        this.taillePoile = 5.5;
    }

    public Chien(String name) {
        this.name = name;
        this.age = 1;
        this.taillePoile = 5.5;
    }

    public void afficheInfo() {
        StringBuilder s1 = new StringBuilder().append("Je m'appelle ").append(this.name).append(" j'ai ")
                .append(this.age).append(" ans mes poils font ").append(this.taillePoile).append(" cm");
        System.out.println(s1);
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}