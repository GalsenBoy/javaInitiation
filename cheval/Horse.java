package cheval;

public class Horse {
    protected String name;
    protected int posX;
    protected int posY;

    /**
     * @param name nom du cheval
     * @param x    la position horizontale du cheval
     * @param y    la position verticale du cheval
     */
    public Horse(String name, int x, int y) {
        this.name = name;
        this.posX = x;
        this.posY = y;
    }

    /**
     * Affiche le déplacement du joueur
     */
    public void move() {
        StringBuilder mv = new StringBuilder().append(this.name).append(" se trouve à la position : PosX = ")
                .append(this.posX).append("  PosY = ").append(this.posY);
        System.out.println(mv);
    }

}
