package ho5;
/*Joel Amah*/
import java.applet.Applet;
import java.awt.*;

public class variabelenh5 extends Applet {
    /*Declaratie*/
    Color Opvulkleur;
    Color Lijnkleur;
    int Width;
    int Height;

    public void init() {
        Opvulkleur= Color.MAGENTA;
        Lijnkleur = Color.BLACK;
        Width = 180;
        Height = 100;
    }
    public void paint(Graphics g) {
        //Size
        setSize(800,500);
        /*lijn*/
        g.drawLine(20,20,200,20);
        g.drawString("Lijn", 100,40);

        /*Rechthoek*/
        g.drawRect(20,50,Width,Height);
        g.drawString("Rechthoek",80,170);

        /*Afgeronde rechthoek*/
        g.drawRoundRect(20,180,Width,Height, 30,30);
        g.drawString("Afgeronde Rechthoek",50,300);

        /*gevulde rechthoek met ovaal*/
        g.setColor(Opvulkleur);
        g.fillRect(225,50,Width,Height);
        g.setColor(Lijnkleur);
        g.drawOval(225,50,Width,Height);
        g.drawString("Gevulde rechthoek met ovaal",235,170);
        /*JoelAmah*/
        /*gevulde Ovaal*/
        g.setColor(Opvulkleur);
        g.fillOval(225,180,Width,Height);
        g.setColor(Lijnkleur);
        g.drawString("Gevulde ovaal",275,300);

        /*Taartpunt met ovaal eromheen*/
        g.setColor(Opvulkleur);
        g.fillArc(450, 50,Width,Height,355,45);
        g.setColor(Lijnkleur);
        g.drawOval(450,50,Width,Height);
        g.drawString("Taartpunt met ovaal eromheen",460,170);

        /*Cirkel*/
        g.setColor(Lijnkleur);
        g.drawOval(485,180,Width,Height);
        g.drawString("Cirkel",518,300);
    }
}
