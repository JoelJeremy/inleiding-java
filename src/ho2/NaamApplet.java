package ho2;

import java.applet.Applet;
import java.awt.*;

public class NaamApplet extends Applet {
    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Joel Jeremy Amah", 150, 150);
    }

}

