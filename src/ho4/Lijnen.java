package ho4;
/*Joel Amah*/
import java.awt.*;
import java.applet.Applet;

public class Lijnen extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(20,20,100,50);
        g.fillRect(20,80,100,50);
        g.drawOval(150,20,100,50);
        g.fillOval(150,80,100,50);
        g.drawRect(200, 150, 60,60);
    }
}
