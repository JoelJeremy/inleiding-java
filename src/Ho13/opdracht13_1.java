package Ho13;

import java.applet.Applet;
import java.awt.*;

public class opdracht13_1 extends Applet {

    public void init() {

        setSize(1000,600);
        setBackground(Color.white);

    }

    public void paint(Graphics g) {

        tekenDriehoek( g,100,200,300,200,200,100);
        tekenDriehoek(g,100,100,150,150,100,200);
        tekenDriehoek(g,300,200,200,100,100,300);

        tekenVierkant(g, 100,400,200,600,50,80,300,100);

    }

    void tekenDriehoek (Graphics g,int x1, int y1, int x2, int y2, int x3, int y3) {

        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x1,y1);

    }

    void tekenVierkant ( Graphics g, int x1, int y1, int x2,int y2, int x3, int y3, int x4, int y4) {

        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x4,y4);
        g.drawLine(x4,y4,x1,y1);

    }
}