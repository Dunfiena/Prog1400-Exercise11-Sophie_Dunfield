import java.awt.*;

public class Car {
    private Color carBody;
    private int Height;
    private int Width;
    private int xPostition;
    private int yPosition;

    public Car(Color carBody, int height, int width, int xPostition, int yPosition) {
        this.carBody = carBody;
        Height = height;
        Width = width;
        this.xPostition = xPostition;
        this.yPosition = yPosition;
    }
    public void drawVehicle(Graphics g, Color carbody, int height, int width, int xPosition, int yPosistion){
        //Body of the car
        g.setColor(carbody);
        g.fillRect(xPosition, yPosistion, width, (height/2));
        g.setColor(Color.black);
        //Roof of the car
        g.drawLine((xPosition+(xPosition/2)), (height/2), (xPosition+(xPosition/8)), yPosistion);
        g.drawLine((width+xPostition-(xPosition/2)), (height/2), (width+xPostition-(xPosition/8)), yPosistion);
        g.drawRect((xPosition+(xPosition/2)),height/2 ,
                width/3, (yPosistion/2));
        //2 tires
        g.fillRect((xPosition+(xPosition/8)),(yPosition+(yPosition/2)-(yPosition/8)), width/8, width/6 );
        g.fillRect((width+xPostition-(xPosition/8)-width/8),(yPosition+(yPosition/2)-(yPosition/8)), width/8, width/6 );
        //Headlights
        g.setColor(Color.yellow);
        g.fillOval((xPosition+(xPosition/8)),(yPosition+(yPosition/3)-(yPosition/4)), width/8, width/12 );
        g.fillOval((width+xPostition-(xPosition/8)-width/8),(yPosition+(yPosition/3)-(yPosition/4)), width/8, width/12 );
    }

    public Color getCarBody() {
        return carBody;
    }

    public int getHeight() {
        return Height;
    }

    public int getWidth() {
        return Width;
    }

    public int getxPostition() {
        return xPostition;
    }

    public int getyPosition() {
        return yPosition;
    }
}
