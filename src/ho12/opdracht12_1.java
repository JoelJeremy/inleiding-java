package ho12;

import java.applet.Applet;
import java.awt.*;

public class opdracht12_1 extends Applet {

    double getallen[] = {4,89,3,34,50,6,7,8,19,27};
    double totaal = 0;
    double result;

    public void init () {

        setSize(1000, 800);

    }

    public void paint (Graphics g) {

        for ( int teller = 0; teller < getallen.length; teller ++) {
            totaal += getallen[teller];
        }

        result = totaal / getallen.length;

        System.out.println(totaal);
        System.out.println(result);
        System.out.println(getallen.length);

        int y = 100;

        for (int teller= 0; teller <= 10; teller++) {

            y += 50;
            g.drawLine(100, y, 200, y);

        }

        for (int teller = 0; teller < getallen.length; teller ++) {

            g.drawString("" + getallen[teller], 130, 50 * teller + 130);

        }

        g.drawString("Gemmidelde:             "+ result,15,630);
        g.drawRect(100,100,100,550);
    }
}


