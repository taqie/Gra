package pl.taq.pierwsza.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Timer;

import pl.taq.pierwsza.entitis.PlayerShip;
import pl.taq.pierwsza.graasdasd.asdasd;
import pl.taq.pierwsza.ui.ScoreLabel;

/**
 * Created by root on 14.06.16.
 */
public class ShipGamePlayScreen extends AbstractScreen {
    private PlayerShip playerShip;
    private ScoreLabel scoreLabel;
    public ShipGamePlayScreen(asdasd game) {
        super(game);
    }


    @Override
    protected void init() {
        initPlayerShip();
        initScoreLabel();
    }

    private void initScoreLabel(){
        scoreLabel = new ScoreLabel();
        stage.addActor(scoreLabel);
    }
    private void initPlayerShip(){
        playerShip = new PlayerShip();
        stage.addActor(playerShip);
//        playerShip.move();
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
        stage.act();
    }
}
