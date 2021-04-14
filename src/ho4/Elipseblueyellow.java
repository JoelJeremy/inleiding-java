package ho4;
/*Joel Amah*/
import java.applet.Applet;
import java.awt.*;

public class Elipseblueyellow extends Applet {
    public void init() {
        setBackground(Color.blue);
    }
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(100,100,150,100,360,90);
        g.fillArc(100,100,150,100,90,90);
        g.fillArc(100,100,150,100,270,90);
        g.fillArc(100,100,150,100,180,90);

    }




}
