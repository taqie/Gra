package pl.taq.pierwsza.screen;

import pl.taq.pierwsza.entitis.Player;
import pl.taq.pierwsza.graasdasd.asdasd;

/**
 * Created by root on 14.06.16.
 */
public class GamePlayScreeen extends AbstractScreen {

    private Player player;

    public GamePlayScreeen(asdasd game) {
        super(game);
        init();
    }
    private void init(){
        initPlayer();
    }
    private void initPlayer(){
        player = new Player();
        stage.addActor(player);

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
        stage.act();


    }
}
