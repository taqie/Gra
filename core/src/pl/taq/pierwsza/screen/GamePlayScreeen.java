package pl.taq.pierwsza.screen;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import pl.taq.pierwsza.entitis.Player;
import pl.taq.pierwsza.graasdasd.asdasd;

/**
 * Created by root on 14.06.16.
 */
public class GamePlayScreeen extends AbstractScreen {

    private Player player;
    private Button playerButton;
    private Label scoreLabel;
    private Label.LabelStyle labelStyle;
    public GamePlayScreeen(asdasd game) {
        super(game);

    }
    @Override
    protected void init(){
        initPlayer();
        initPlayerButton();
        initStyleLabel();
        initScoreLabel();
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
        playerButton = new Button(new Button.ButtonStyle());
        playerButton.setWidth(460);
        playerButton.setHeight(360);
        playerButton.setY(170);
        playerButton.setX(10);
        playerButton.setDebug(true);

        stage.addActor(playerButton);
        playerButton.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                player.reactOnClick();
                game.addPoint();
                return super.touchDown(event, x, y, pointer, button);
            }
        });
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
