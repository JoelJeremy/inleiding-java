package ho11;

import java.applet.*;
import java.awt.*;

public class opdracht115 extends Applet {

    public void init() {
        setSize(800,500);
        setBackground(Color.white);
    }

    public void paint (Graphics g) {

        int teller;
        int x = 50;
        int y = 50;

        for (teller = 0; teller < 5; teller++) {
            x += 50;
            y += 50;

            g.setColor(Color.black);
            g.drawRect(x, y,50, 50);
        }
    }
}
