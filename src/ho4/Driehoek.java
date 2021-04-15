package ho4;
/*Joel Amah*/
import java.applet.Applet;
import java.awt.*;

public class Driehoek extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        g.drawLine(100,20, 50,100);
        g.drawLine(50,100,150, 100);
        g.drawLine(100, 20,150,100 );
    }
}
