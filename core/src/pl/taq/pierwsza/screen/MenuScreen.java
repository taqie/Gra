package pl.taq.pierwsza.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.utils.Timer;

import pl.taq.pierwsza.graasdasd.asdasd;
import pl.taq.pierwsza.ui.ClicerGameButton;
import pl.taq.pierwsza.ui.ClickCallBack;
import pl.taq.pierwsza.ui.ShipGameButton;

/**
 * Created by root on 14.06.16.
 */
public class MenuScreen extends AbstractScreen{
    private ClicerGameButton clicerButton;
    private ShipGameButton shipButton;
    public MenuScreen(asdasd game) {
        super(game);

    }

    @Override
    protected void init() {
        initClickerButton();
        initShipButton();
    }
    private void initShipButton(){
        shipButton = new ShipGameButton(new ClickCallBack() {
            @Override
            public void onclick() {
                Timer.schedule(new Timer.Task() {
                    @Override
                    public void run() {
                        game.setScreen(new ShipGamePlayScreen(game));
                    }
                },(float) 0.3);
            }
        });
        stage.addActor(shipButton);
    }

    private  void initClickerButton(){
        clicerButton = new ClicerGameButton(new ClickCallBack() {
            @Override
            public void onclick() {
                Timer.schedule(new Timer.Task() {
                    @Override
                    public void run() {
                        game.setScreen(new GamePlayScreeen(game));
                    }
                }, (float) 0.3);
            }
        });
        stage.addActor(clicerButton);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        spriteBatch.begin();
        stage.draw();
        spriteBatch.end();
    }
}
