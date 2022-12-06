package cheval;

public class Pegasus extends Horse {
    private int poxZ;

    /**
     * @param name nom du pégase
     * @param x    position horizontale du pégase
     * @param y    position verticale du pégase
     * @param z    altitude du pégase
     */
    public Pegasus(String name, int x, int y, int z) {
        super(name, x, y);
        this.poxZ = z;
    }

    /**
     * Affiche la hauteur du pégase
     */
    public void fly() {
        StringBuilder fl = new StringBuilder().append(this.name).append(" se trouve à une altitude de ")
                .append(this.poxZ);
        System.out.println(fl);
    }
}
