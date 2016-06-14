package pl.taq.pierwsza.screen;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import pl.taq.pierwsza.entitis.Player;
import pl.taq.pierwsza.graasdasd.asdasd;
import pl.taq.pierwsza.ui.ClickCallBack;
import pl.taq.pierwsza.ui.PlayerButton;

/**
 * Created by root on 14.06.16.
 */
public class GamePlayScreeen extends AbstractScreen {

    private Player player;
    private PlayerButton playerButton;
    private Label scoreLabel;
    private Label.LabelStyle labelStyle;
    private Button resetScoreButton;
    public GamePlayScreeen(asdasd game) {
        super(game);

    }
    @Override
    protected void init(){
        initPlayer();
        initPlayerButton();
        initStyleLabel();
        initScoreLabel();
        initResetScoreButton();
    }
    private void initResetScoreButton()
    {
        resetScoreButton = new Button(new Button.ButtonStyle());
        resetScoreButton.setX(330);
        resetScoreButton.setY(560);
        resetScoreButton.setWidth(100);
        resetScoreButton.setHeight(100);
        resetScoreButton.setDebug(true);
        stage.addActor(resetScoreButton);
        resetScoreButton.addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                game.resetGameScore();
                return super.touchDown(event, x, y, pointer, button);
            }
        });
    }
    private void initStyleLabel(){
        labelStyle = new Label.LabelStyle();
        labelStyle.font = new BitmapFont();
    }
    private void initScoreLabel(){
        scoreLabel = new Label("",labelStyle);
        scoreLabel.setX(30);
        scoreLabel.setY(650);
        stage.addActor(scoreLabel);
    }

    private void initPlayer(){
        player = new Player();
        stage.addActor(player);

    }
    private  void initPlayerButton(){
        playerButton = new PlayerButton(new ClickCallBack() {
            @Override
            public void onclick() {
                player.reactOnClick();
                game.addPoint();
            }
        });
        stage.addActor(playerButton);

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
        scoreLabel.setText("Score : "+game.getPoints());
        stage.act();
    }
}
