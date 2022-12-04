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
        System.out.println(this.name + " se trouve à la position : PosX = " + this.posX + " PosY = " + this.posY);
    }

}
