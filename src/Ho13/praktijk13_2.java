package Ho13;

import java.applet.Applet;
import java.awt.*;

public class praktijk13_2 extends Applet {

    public void init() {

        setSize(1400, 700);

    }

    public void paint(Graphics g) {

        tekenstam(g, 250, 180, 20, 150, Color.orange, 5, 2);

        tekenbladeren(g, 210, 100, 100, 100, Color.green, 5, 2);

    }

    void tekenstam(Graphics g, int beginpuntx, int beginpunty, int breedtestam, int hoogtestam, Color kleurstam, int aantalnaast, int aantalonder) {

        for (int naast = 0; naast < aantalnaast; naast++) {

            for (int onder = 0; onder < aantalonder; onder++) {

                g.setColor(kleurstam);
                g.fillRect(beginpuntx + naast * breedtestam * 10, beginpunty + onder * hoogtestam * 2, breedtestam, hoogtestam);

                g.setColor(Color.black);
                g.drawRect(beginpuntx + naast * breedtestam * 10, beginpunty + onder * hoogtestam * 2, breedtestam, hoogtestam);

            }
        }
    }

    void tekenbladeren(Graphics g, int begintpuntx, int beginpunty, int breedtecirkel, int hoogtecirkel, Color kleurblad, int aantalnaast, int aantalonder) {


        for (int naast = 0; naast < aantalnaast; naast++) {

            for (int onder = 0; onder < aantalonder; onder++) {

                g.setColor(kleurblad);
                g.fillOval(begintpuntx + naast * breedtecirkel * 2 , beginpunty + onder * hoogtecirkel * 3, breedtecirkel, hoogtecirkel);

                g.setColor(Color.black);
                g.drawOval(begintpuntx + naast * breedtecirkel * 2 , beginpunty + onder * hoogtecirkel * 3, breedtecirkel, hoogtecirkel);

            }
        }
    }
}


