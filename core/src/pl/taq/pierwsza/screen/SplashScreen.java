package pl.taq.pierwsza.screen;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.Environment;

import pl.taq.pierwsza.graasdasd.asdasd;

/**
 * Created by TaQ on 2016-06-09.
 */
public class SplashScreen extends AbstractScreen {

    private Texture splashImg;

    public SplashScreen(asdasd game) {
        super(game);
        init();
    }

    private void  init(){
        //TODO implement better assets loading for game
        splashImg = new Texture("badlogic.png");

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        spriteBatch.begin();
        spriteBatch.draw(splashImg, 0, 0);
        spriteBatch.end();
    }
}
