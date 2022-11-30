public class Chien {
    private String name;
    private int age;
    private double taillePoile;

    public Chien(String name, int age, double taillePoile) {
        this.taillePoile = taillePoile;
        this.name = name;
        this.age = age;
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