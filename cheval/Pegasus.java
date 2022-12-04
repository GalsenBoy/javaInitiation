package cheval;

public class Pegasus extends Horse {
    private int poxZ;

    public Pegasus(String name, int x, int y, int z) {
        super(name, x, y);
        this.poxZ = z;
    }

    public void fly() {
        System.out.println(this.name + " se trouve à une altitude de " + this.poxZ);
    }
}
