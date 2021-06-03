package ho6;
/*Joel Amah*/
import java.applet.Applet;
import java.awt.*;

public class Uren62 extends Applet {
    int uur;
    int dag;
    int jaar;

    public void init() {
        uur = 60*60;
        dag = uur*24;
        jaar = dag*365;

    }
    public void paint(Graphics g) {
        g.drawRect(80,80,200,80);


        g.drawString("Uur:"  ,100,100);
        g.drawString("dag:" , 100, 120);
        g.drawString("Jaar:", 100, 140);

        g.drawString("Seconden:" + uur, 140, 100);
        g.drawString("Seconden:" + dag, 140, 120);
        g.drawString("Seconden:" + jaar, 140, 140);
    }
}
