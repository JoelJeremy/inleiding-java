package ho2;

import java.applet.Applet;
import java.awt.*;

public class Namen extends Applet {
    public void init() {
        setBackground(Color.white);
    }
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawString("Joel",175, 100);
        g.setColor(Color.red);
        g.drawString("Amah",175, 150);
    }
}
