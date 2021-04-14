package ho4;
/*Joel Amah*/
import java.applet.Applet;
import java.awt.*;

public class NLvlag extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        /*rood*/
        g.drawRect(20,20,10,400);
        g.setColor(Color.red);
        g.fillRect(30,20, 150,50);
        g.setColor(Color.BLACK);
        g.drawRect(30,20,150,50);
        /*wit*/
        g.drawRect(30,70,150,50);
        /*blauw*/
        g.setColor(Color.blue);
        g.fillRect(30,120, 150,50);
        g.setColor(Color.BLACK);
        g.drawRect(30,120,150,50);
        /* ik heb een zwarte outline gemaakt door een drawRect
        te maken op de coordinaten van de fillRects van de kleuren zwart en rood.*/
    }
}
