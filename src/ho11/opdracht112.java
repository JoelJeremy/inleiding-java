package ho11;

import java.applet.Applet;
import java.awt.*;

public class opdracht112 extends Applet {

    public void init() {
        setSize(800,400);
        setBackground(Color.orange);
    }

    public void paint (Graphics g) {

        int teller;
        int x = 50;

        for (teller = 20; teller > 9; teller--) {
            x += 20;
            g.drawString("" + teller, x, 100);

        }
    }
}