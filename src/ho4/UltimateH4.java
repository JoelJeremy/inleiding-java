package ho4;
/*Joel Amah*/
import java.applet.Applet;
import java.awt.*;

public class UltimateH4 extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        //Size
        setSize(800,500);
        /*lijn*/
        g.drawLine(20,20,200,20);
        g.drawString("Lijn", 100,40);

        /*Rechthoek*/
        g.drawRect(20,50,180,100);
        g.drawString("Rechthoek",80,170);

        /*Afgeronde rechthoek*/
        g.drawRoundRect(20,180,180,100, 30,30);
        g.drawString("Afgeronde Rechthoek",50,300);

        /*gevulde rechthoek met ovaal*/
        g.setColor(Color.magenta);
        g.fillRect(225,50,180,100);
        g.setColor(Color.black);
        g.drawOval(225,50,180,100);
        g.drawString("Gevulde rechthoek met ovaal",235,170);
/*JoelAmah*/
        /*gevulde Ovaal*/
        g.setColor(Color.MAGENTA);
        g.fillOval(225,180,180,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",275,300);

        /*Taartpunt met ovaal eromheen*/
        g.setColor(Color.magenta);
        g.fillArc(450, 50,180,100,360,45);
        g.setColor(Color.black);
        g.drawOval(450,50,180,100);
        g.drawString("Taartpunt met ovaal eromheen",460,170);

        /*Cirkel*/
        g.setColor(Color.black);
        g.drawOval(485,180,100,100);
        g.drawString("Cirkel",518,300);

    }
}
