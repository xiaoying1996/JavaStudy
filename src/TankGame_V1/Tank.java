package TankGame_V1;

public class Tank {
    private int x;//坦克的横坐标
    private int y;//坦克的纵坐标

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
