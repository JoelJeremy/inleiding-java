package ho11;

import java.applet.Applet;
import java.awt.*;

public class opdracht119 extends Applet {

    int b = 50;
    int h = 50;
    int x;
    int y;

    public void init() {

        setSize(1900, 1000);

    }

    public void paint(Graphics g) {

        System.out.println();

        for (int kolom = 0; kolom < 8; kolom++) {
            x=100;
            y += h;
            for(int rij = 0; rij < 8; rij++) {

                if ((kolom+rij)%2==0) {
                    g.setColor(Color.black);
                    g.drawRect(x, y, b, h);
                    g.fillRect(x, y, b, h);
                } else {
                    g.setColor(Color.black);
                    g.drawRect(x, y, b, h);
                }
                x += b;
            }
        }
    }
}
