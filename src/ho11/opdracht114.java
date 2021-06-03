package ho11;

import java.applet.Applet;
import java.awt.*;

public class opdracht114 extends Applet {

    int b=3;
    int y;
    int antwoord;

    public void init() {

        setSize(600,400);
        setBackground(Color.green);

    }

    public void paint (Graphics g) {

        y = 90;
        for (int teller = 0; teller <= 12; teller++) {

            y += 20;
            antwoord = (teller*b);

            g.drawString(teller + "  x  " + b + " = " + antwoord , 100, y);

        }
    }
}
