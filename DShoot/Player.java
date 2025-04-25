import java.awt.*;

public class Player {
    private int x, y, dx;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void update() {
        x += dx;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 50, 50);
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
