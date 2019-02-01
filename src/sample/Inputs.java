package sample;

import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.Scanner;

public class Inputs {
    private Scene scene;

    public  Inputs(Scene scene)
    {
        this.scene = scene;
    }

    public void kEvent()
    {
        scene.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {
            if(key.getCode()== KeyCode.UP) {
                // Direction up
            }
            else if(key.getCode()== KeyCode.RIGHT) {
                // Direction right
            }
            else if(key.getCode()== KeyCode.DOWN) {
                // Direction down
            }
            else if(key.getCode()== KeyCode.LEFT) {
                // Direction Left
            }
        });
    }


}
