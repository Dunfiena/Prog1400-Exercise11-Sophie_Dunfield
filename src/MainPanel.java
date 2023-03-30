import javax.swing.*;
import java.awt.*;

public class MainPanel extends JFrame {

    public MainPanel(){
        DrawACar draw=new DrawACar();
        this.setBounds(0,0,600,400);
        this.setVisible(true);
        this.setTitle("A very tiny Ostrich and a car");
        draw.setVisible(true);
        add(draw);
    }
}
