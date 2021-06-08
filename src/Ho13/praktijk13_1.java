package Ho13;

import java.applet.Applet;
import java.awt.*;

public class praktijk13_1 extends Applet {

    public void init() {

        setSize(1200, 700);

    }

    public void paint(Graphics g) {

        tekenstam(g, 250, 180, 20,100, Color.orange);
        tekenbladeren(g, 210,100,100,100, Color.green);
    }

    void tekenstam(Graphics g, int beginpuntx, int beginpunty, int breedtestam, int hoogtestam, Color kleurstam) {

        g.setColor(kleurstam);
        g.fillRect(beginpuntx, beginpunty, breedtestam, hoogtestam);

        g.setColor(Color.black);
        g.drawRect(beginpuntx, beginpunty, breedtestam, hoogtestam);

    }

    void tekenbladeren(Graphics g, int begintpuntx, int beginpunty, int breedtecirkel, int hoogtecirkel, Color kleurblad ) {

        g.setColor(kleurblad);
        g.fillOval(begintpuntx,beginpunty,breedtecirkel,hoogtecirkel);

        g.setColor(Color.black);
        g.drawOval(begintpuntx,beginpunty,breedtecirkel,hoogtecirkel);
    }
}


