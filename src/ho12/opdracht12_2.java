package ho12;

import java.applet.Applet;
import java.awt.*;

public class opdracht12_2 extends Applet {

    Button knop[] = new Button[25];

    public void init () {

        setSize(800, 400);

        for (int teller = 0; teller < knop.length; teller++) {
            knop[teller] = new Button(teller + "");
            add(knop[teller]);
        }
    }

    public void paint (Graphics g) {

    }
}

