package ho11;

import java.applet.Applet;
import java.awt.*;

public class opdracht111 extends Applet {

    public void init() {
        setSize(800,400);
        setBackground(Color.green);
    }

    public void paint (Graphics g) {

        int teller;
        int x = 50;

        for (teller = 1; teller < 11; teller++) {
            x += 20;
            g.drawLine(x, 50, x, 300);
            g.drawString("" + teller, x, 30);

        }
    }
}
