package ho11;

import java.applet.Applet;
import java.awt.*;

public class opdracht113 extends Applet {

    int a = 0;
    int b = 1;
    int c;

    String s= a+ "," + b +"";

    public void init() {
        setSize(800,400);
        setBackground(Color.orange);
    }

    public void paint (Graphics g) {

        for (c = 1; c < 100; c++) {

            c = a+b;
           s+=","+c;
            System.out.println(c);
           a=b;
           b=c;

        }
        g.drawString(s, 100 , 100);
    }
}