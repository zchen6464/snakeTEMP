package sample;

import com.sun.org.apache.bcel.internal.classfile.ConstantString;
import javafx.scene.shape.Circle;

public class Food extends Circle {
    private int xPos, yPos;


    public Food(int y, int x)
    {
        this.xPos = x;
        this.yPos = y;
    }

    public int[] getPos()
    {

        int[] coord = {yPos,xPos};
        return coord;
    }

    public void show()
    {
        setCenterX(xPos * Constants.XSCALE);
        setCenterY(yPos * Constants.YSCALE);
    }

}
