package ho6;
/*Joel Amah*/
import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht6 extends Applet {
    double c1,c2,c3,delen,result;
    double step;
    double uitkomst;

    int tussen;


    public void init() {
        c1 = +5.9;
        c2 = +6.3;
        c3 = +6.9;
        delen = 3;

        result = (c1 + c2 + c3) / delen;
        step = result * 10;

        tussen = (int) step;
        uitkomst = (double) tussen/10;

    }
    public void paint(Graphics g) {
        g.drawRect(100,100,240,60);

        g.drawString("gemiddelde:    " + uitkomst, 120, 120);

    }
}
