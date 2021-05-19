package ho11;

import java.applet.*;
import java.awt.*;

public class opdracht118 extends Applet {

    int z;
    int teller;

    public void init() {
        setSize(1900,1000);
        setBackground(Color.black);
    }

    public void paint (Graphics g) {


        for (z = 0; z < 1500; z++) {
            z += 15;

            g.setColor(Color.white);
            g.drawOval(900-z/2, 500-z/2,z,z);

        }
    }
}