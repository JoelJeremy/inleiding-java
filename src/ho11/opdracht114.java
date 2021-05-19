package ho11;

import java.applet.Applet;
import java.awt.*;

public class opdracht114 extends Applet {

    int a=0;
    int b=3;
    int y=100;

    String s= a+"," + b +"";

    public void init() {
        setSize(800,500);
        setBackground(Color.green);
    }

    public void paint (Graphics g) {


        for (int teller = 0; teller <= 12; teller++) {

            y += 20;
            g.drawString(a + "  x  " + b + " = " + (a * b), 100, y);

            a++;
        }
    }
}
