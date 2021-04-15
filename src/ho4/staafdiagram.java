package ho4;
/*Joel Amah*/
import java.applet.Applet;
import java.awt.*;

public class staafdiagram extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        /*body*/
        g.drawRect( 100,100,500,250);

        g.drawLine(100,150,600,150);
        g.drawLine(100,200,600,200);
        g.drawLine(100,250,600,250);
        g.drawLine(100,300,600,300);
        g.drawLine(100,350,600,350);

        /*variabelen*/
        getGraphics().drawString("0kg",75,360);
        getGraphics().drawString("20kg",70,305);
        getGraphics().drawString("40kg",70,255);
        getGraphics().drawString("60kg",70,205);
        getGraphics().drawString("80kg",70,155);
        getGraphics().drawString("100kg",65,105);

        /*names*/
        getGraphics().drawString("Valerie",170,370);
        getGraphics().drawString("Jeroen",325,370);
        getGraphics().drawString("Hans",475,370);

        /*staven*/
        g.setColor(Color.magenta);
        g.fillRect(180,250,20,100);
        g.setColor(Color.black);
        g.drawRect(180,250,20,100);

        g.setColor(Color.green);
        g.fillRect(330,100,20,250);
        g.setColor(Color.black);
        g.drawRect(330,100,20,250);

        g.setColor(Color.blue);
        g.fillRect(485,150,20,200);
        g.setColor(Color.black);
        g.drawRect(485,150,20,200);
    }
}
