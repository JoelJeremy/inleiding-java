package ho4;
/*Joel Amah*/
import java.applet.Applet;
import java.awt.*;

public class Dobbelsteen extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        /*body*/
        g.setColor(Color.red);
        g.fillRoundRect(100,100,500,500,125,125);
        g.setColor(Color.black);
        g.drawRoundRect(100,100,500,500,125,125);
        /*Dots*/
        g.setColor(Color.orange);
        g.fillOval(200,200,100,100);
        g.setColor(Color.black);
        g.drawOval(200,200,100,100);
/*Joel Amah*/
        g.setColor(Color.orange);
        g.fillOval(400,200,100,100);
        g.setColor(Color.black);
        g.drawOval(400,200,100,100);

        g.setColor(Color.orange);
        g.fillOval(200,400,100,100);
        g.setColor(Color.black);
        g.drawOval(200,400,100,100);

        g.setColor(Color.orange);
        g.fillOval(400,400,100,100);
        g.setColor(Color.black);
        g.drawOval(400,400,100,100);

    }
}
