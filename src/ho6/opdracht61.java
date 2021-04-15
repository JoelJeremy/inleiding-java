package ho6;

import java.applet.Applet;
import java.awt.*;

public class opdracht61 extends Applet {
   int uitkomst;


    public void init() {
             uitkomst = 113/4;

    }
    public void paint(Graphics g) {
        g.drawRect(90,80,250,100);

        g.drawString("Krijgt: " + uitkomst, 200, 100);
        g.drawString("Krijgt  " + uitkomst, 200, 120);
        g.drawString("Krijgt: " + uitkomst, 200, 140);
        g.drawString("Krijgt: " + uitkomst, 200, 160);

        g.drawString("Jan",100,100);
        g.drawString("Ali",100,120);
        g.drawString("Jeannette",100,140);
        g.drawString("Joel",100,160);

    }
}
