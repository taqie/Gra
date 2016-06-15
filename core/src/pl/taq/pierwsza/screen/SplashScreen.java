package pl.taq.pierwsza.screen;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.utils.Timer;

import pl.taq.pierwsza.graasdasd.asdasd;

/**
 * Created by TaQ on 2016-06-09.
 */
public class SplashScreen extends AbstractScreen {

    private Texture splashImg;

    public SplashScreen(final asdasd game) {
        super(game);
        Timer.schedule(new Timer.Task() {
            @Override
            public void run() {
                game.setScreen(new MenuScreen(game));
            }
        },1);

    }
    @Override
    protected void  init(){
        //TODO implement better assets loading for game
        splashImg = new Texture("splesh.png");

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        spriteBatch.begin();
        spriteBatch.draw(splashImg, 0, 0);
        spriteBatch.end();
    }
}
