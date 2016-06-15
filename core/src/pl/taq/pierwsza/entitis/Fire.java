package pl.taq.pierwsza.entitis;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by root on 15.06.16.
 */
public class Fire extends Image {
    private final static int WIDTH = 1;
    private final static int HEIGHT = 2;



    private int Vy=2;
    private int dmg;
    private float y;
    public Fire(float x, float y) {
        super(new Texture("fire.png"));
        this.setOrigin(WIDTH/2,HEIGHT/2);
        this.setSize(WIDTH,HEIGHT);
        //starting position
        this.y = y;
        this.setPosition(x,y);
    }

    public void move(){
        Action ruch;
        this.y = this.y+this.Vy;
        ruch = Actions.moveBy(0,this.y,2f, Interpolation.sine);
        this.addAction(ruch);
    }

}
