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
        System.out.println(
                "Je mappelle" + " " + this.name + " " + "j'ai" + " " + this.age + "ans et mes poils font :" + " "
                        + this.taillePoile + " " + "cm");
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
