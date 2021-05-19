package ho11;

import java.applet.*;
import java.awt.*;

public class opdracht116 extends Applet {

    int z;
    int teller;

    public void init() {
        setSize(800,500);
        setBackground(Color.yellow);
    }

    public void paint (Graphics g) {

        for (z=0; z <= 100; z++) {
            z +=20;

            g.setColor(Color.magenta);
            g.drawOval(350-z/2 , 200-z/2 , z , z );

        }
    }
}