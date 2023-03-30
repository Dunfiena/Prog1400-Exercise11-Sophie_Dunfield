import javax.swing.*;
import java.awt.*;

public class DrawACar extends JPanel {

    protected void paintComponent(Graphics g) {
        Car mazda = new Car(Color.RED, 150, 300, 200, 200);
        mazda.drawVehicle(g, mazda.getCarBody(), mazda.getHeight(), mazda.getWidth(),
                mazda.getxPostition(), mazda.getyPosition());
        Ostrich ostrich=new Ostrich();
        ostrich.drawOstrich(g);
    }
}
