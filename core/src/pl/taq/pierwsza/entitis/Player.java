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
        int xMove = MathUtils.random(-100,100);
        int yMove = 30;
        float timeMoveandGrow =0.3f;
        float timeRotate = 0.5f;
        Action moveAction = Actions.sequence(
                Actions.moveBy(xMove,yMove,timeMoveandGrow, Interpolation.circleOut),
                Actions.moveBy(-xMove,-yMove,timeMoveandGrow,Interpolation.bounceOut)
        );
        int xChangeSize = MathUtils.random(-100,100);
        int yChangeSize = 10;
        int rotation = MathUtils.random(-360,360);
        Action gorwAction = Actions.sequence(
                Actions.sizeBy(xChangeSize,yChangeSize,timeMoveandGrow,Interpolation.elasticOut),
                Actions.sizeBy(-xChangeSize,-yChangeSize,timeMoveandGrow,Interpolation.elasticIn)

                );


        this.addAction(moveAction);
        this.addAction(gorwAction);
        if(this.getHeight() > 180)
        {
            this.addAction(Actions.sequence(
                    Actions.rotateBy(rotation,timeRotate,Interpolation.sine),
                    Actions.rotateBy(-rotation,timeRotate,Interpolation.pow5)
            ));
        }
    }
}
