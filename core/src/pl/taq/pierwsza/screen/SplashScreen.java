package pl.taq.pierwsza.screen;

import com.badlogic.gdx.graphics.Texture;

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
        splashImg = new Texture("badlogic.jpg");
    }

}
