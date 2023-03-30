import java.awt.*;

public class Ostrich{

    public void drawOstrich(Graphics g){
        g.setColor(Color.black);
        //feet
        g.fillRect(160, 350, 25, 10);
        g.fillRect(185, 350, 25, 10);
        //legs
        g.fillRect(165, 315, 5, 35);
        g.fillRect(175, 315, 5, 35);
        g.fillRect(190, 315, 5, 35);
        g.fillRect(200, 315, 5, 35);
        //bottom body
        g.fillRect(155, 310, 10, 5);
        g.fillRect(180, 310, 10, 5);
        g.fillRect(205, 310, 15, 5);
        //body sides
        g.fillRect(150, 280, 5, 30);
        g.fillRect(220, 275, 5, 35);
        g.fillRect(215, 270, 5,5);
        g.fillRect(205, 265, 10,5);
        //tbody top
        g.fillRect(200, 270, 5, 10);
        g.fillRect(170, 275, 35,5);
        //neck
        g.fillRect(170, 240, 5, 35);
        g.fillRect(155, 215, 5, 65);
        //head
        g.fillRect(170, 240, 15,5);
        g.fillRect(185, 230, 5,10);
        g.fillRect(180, 225, 5,5);
        g.fillRect(175,215, 5,10 );
        g.fillRect(160, 210,15,5);
        g.fillRect( 165, 220, 5, 10);

        //question mark
        g.fillRect(165, 200, 5, 5);
        g.fillRect(165, 180, 5, 15);
        g.fillRect(165, 180, 15, 5);
        g.fillRect(175, 165, 5, 15);
        g.fillRect(160, 165, 20, 5);





    }
}
