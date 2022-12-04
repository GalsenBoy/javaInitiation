package cheval;

public class Horse {
    protected String name;
    protected int posX;
    protected int posY;

    public Horse(String name, int x, int y) {
        this.name = name;
        this.posX = x;
        this.posY = y;
    }

    public void move() {
        System.out.println(this.name + " se trouve à la position : PosX = " + this.posX + " PosY = " + this.posY);
    }

}
