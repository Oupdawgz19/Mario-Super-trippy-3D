import java.awt.*;

public class Bullet {
    private int x, y;

    public Bullet(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void update() {
        y -= 10;
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, 5, 10);
    }
}

    

