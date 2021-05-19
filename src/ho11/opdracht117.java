package ho11;

import java.applet.*;
import java.awt.*;

public class opdracht117 extends Applet {

    int z;
    int teller;

    public void init() {
        setSize(1100,1100);
        setBackground(Color.black);
    }

    public void paint (Graphics g) {


        for (z=0; z < 750; z++) {
            z += 15;

            g.setColor(Color.magenta);
            g.drawOval(550 - z / 2, 520 - z / 2, z, z);

        }
    }
}