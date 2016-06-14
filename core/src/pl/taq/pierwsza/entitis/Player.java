package pl.taq.pierwsza.entitis;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by root on 14.06.16.
 */
public class Player extends Image{

    private final static int WIDTH = 77;
    private final static int HEIGHT = 152;
    private final static int STARTING_X = 200;
    private final static int STARTING_Y = 300;

    public Player() {
        super(new Texture("badlogic.png"));
        this.setOrigin(WIDTH/2,HEIGHT/2);
        this.setSize(WIDTH,HEIGHT);


        //starting position
        this.setPosition(STARTING_X,STARTING_Y);
    }

    public void reactOnClick(){
        int krokruchu = MathUtils.random(-100,100);

        Action moveAction = Actions.sequence(
                Actions.moveBy(krokruchu,30,0.3f, Interpolation.circleOut),
                Actions.moveBy(-krokruchu,-30,0.3f,Interpolation.bounceOut)
        );
        int zmianaroz = MathUtils.random(-100,100);
        int obrot = MathUtils.random(-360,360);
        Action gorwAction = Actions.sequence(
                Actions.sizeBy(zmianaroz,10,0.3f,Interpolation.elasticOut),
                Actions.sizeBy(-zmianaroz,-10,0.3f,Interpolation.elasticIn)

                );


        this.addAction(moveAction);
        this.addAction(gorwAction);
        if(this.getHeight() > 180)
        {
            this.addAction(Actions.sequence(
                    Actions.rotateBy(obrot,0.5f,Interpolation.sine),
                    Actions.rotateBy(-obrot,0.5f,Interpolation.pow5)
            ));
        }
    }
}
