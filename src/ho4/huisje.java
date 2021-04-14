package ho4;
/*Joel Amah*/
import java.applet.Applet;
import java.awt.*;

public class huisje extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        /*Roof*/
        g.drawLine(200,20, 75,100);
        g.drawLine(75,100,325, 100);
        g.drawLine(200, 20,325,100 );
        /*body*/
        g.drawRect(75, 100, 250,250);
        /*door*/
        g.drawRect(100,250,75,100);
        /*door handle*/
        g.drawRect(110,305,10,10);
        /*window*/
        g.drawRect(210,250,90,75);
    }
}
