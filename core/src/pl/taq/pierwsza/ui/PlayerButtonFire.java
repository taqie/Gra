package pl.taq.pierwsza.ui;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import pl.taq.pierwsza.graasdasd.asdasd;

/**
 * Created by root on 15.06.16.
 */
public class PlayerButtonFire extends Button {
    public PlayerButtonFire(final ClickCallBack clickCallBack) {
        super(new ButtonStyle());
        init(clickCallBack);

    }
    private void init(final ClickCallBack clickCallBack){
        this.setY(0);
        this.setX(0);
        this.setWidth(asdasd.WIDTH);
        this.setHeight(150);
        this.setDebug(false);
        this.addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                clickCallBack.onclick();
                return super.touchDown(event, x, y, pointer, button);
            }
        });
    }
}
