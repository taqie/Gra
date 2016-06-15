package pl.taq.pierwsza.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.badlogic.gdx.utils.Timer;
import com.sun.javafx.scene.control.skin.VirtualFlow;

import pl.taq.pierwsza.entitis.Fire;
import pl.taq.pierwsza.entitis.Player;
import pl.taq.pierwsza.entitis.PlayerShip;
import pl.taq.pierwsza.graasdasd.asdasd;
import pl.taq.pierwsza.ui.ClickCallBack;
import pl.taq.pierwsza.ui.PlayerButtonFire;
import pl.taq.pierwsza.ui.ScoreLabel;

/**
 * Created by root on 14.06.16.
 */
public class ShipGamePlayScreen extends AbstractScreen {
    private PlayerShip playerShip;
    private ScoreLabel scoreLabel;
    private Fire fire;
    private PlayerButtonFire playerButtonFire;
    public ShipGamePlayScreen(asdasd game) {
        super(game);
    }


    @Override
    protected void init() {
        initPlayerShip();
        initScoreLabel();
        initPLayerButtonfire();
        initFire();
    }


    private void initFire(){
        fire = new Fire((playerShip.getX()+75),150);
        stage.addActor(fire);
    }
    private void initPLayerButtonfire(){
        playerButtonFire = new PlayerButtonFire(new ClickCallBack() {
            @Override
            public void onclick() {
               initFire();
            }
        });
        stage.addActor(playerButtonFire);
    }
    private void initScoreLabel(){
        scoreLabel = new ScoreLabel();
        stage.addActor(scoreLabel);
    }
    private void initPlayerShip(){
        playerShip = new PlayerShip();
        stage.addActor(playerShip);
    }



    @Override
    public void render(float delta) {
        super.render(delta);
        update();
        spriteBatch.begin();
        stage.draw();
        spriteBatch.end();
    }

    private void update(){
        scoreLabel.setText("Score : "+ Gdx.input.getAccelerometerX());
        playerShip.move(Gdx.input.getAccelerometerX());
        fire.move();
        stage.act();
    }
}
