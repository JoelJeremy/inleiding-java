package ho4;
/*Joel Amah*/
import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(150,100,150,400);

        g.setColor(Color.red);
        g.fillOval(175,125,100,100);
        g.setColor(Color.black);
        g.drawOval(175,125,100,100);

        g.setColor(Color.orange);
        g.fillOval(175,250,100,100);
        g.setColor(Color.black);
        g.drawOval(175,250,100,100);

        g.setColor(Color.green);
        g.fillOval(175,375,100,100);
        g.setColor(Color.black);
        g.drawOval(175,375,100,100);
    }
}
