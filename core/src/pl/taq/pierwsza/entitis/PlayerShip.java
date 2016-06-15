package pl.taq.pierwsza.entitis;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import pl.taq.pierwsza.graasdasd.asdasd;

/**
 * Created by root on 14.06.16.
 */
public class PlayerShip extends Image {

    private final static int WIDTH = 150;
    private final static int HEIGHT = 150;
    private final static int STARTING_X = 170;
    private final static int STARTING_Y = 50;

    @Override
    public float getX() {
        return x ;
    }

    private float x = STARTING_X;



    private float accelX ;
    private float Vx;
    public PlayerShip() {
        super(new Texture("MADBAD-space-ship-300px.png"));
        this.setOrigin(WIDTH/2,HEIGHT/2);
        this.setSize(WIDTH,HEIGHT);


        //starting position
        this.setPosition(STARTING_X,STARTING_Y);
    }

    public void move(float accelX){
        Action ruch;
        this.accelX=accelX;
        this.Vx = -this.accelX;


        if((this.x+150) >=480)
        {

            if(this.accelX < 0)
            {
                this.Vx = 0;
            }
            else
            {
                this.Vx = -this.accelX;
            }

        }
        else if(this.x < 0 )
        {
            if(this.accelX > 0)
            {
                this.Vx = 0;
            }
            else
            {
                this.Vx = -this.accelX;
            }
        }
        this.x =this.x+(this.Vx+(0.5f*this.Vx));
        ruch = Actions.moveBy(x,0,1f,Interpolation.sine);
        this.addAction(ruch);

    }
    public float getAccelX() {
        return accelX;
    }
    public void setAccelX(float accelX) {
        this.accelX = accelX;
    }
}
