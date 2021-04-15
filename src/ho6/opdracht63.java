package ho6;
/*Joel Amah*/
import java.applet.Applet;
import java.awt.*;

public class opdracht63 extends Applet {
    int waarde;
    int uitkomst;

    public void init() {
        waarde = 2147483647+1;


    }
    public void paint(Graphics g) {
        g.drawRect(80,70, 180,60);
        g.drawString("bereken:    " + waarde, 100, 100);
    }
}
