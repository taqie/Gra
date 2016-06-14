package pl.taq.pierwsza.ui;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

/**
 * Created by root on 14.06.16.
 */
public class PlayerButton extends Button {

    public PlayerButton(final ClickCallBack callBack) {
        super(new ButtonStyle());
        init(callBack);
        }
    private void init(final ClickCallBack callBack){

        this.setWidth(460);
        this.setHeight(360);
        this.setY(170);
        this.setX(10);
        this.setDebug(true);
        this.addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
               callBack.onclick();
                return super.touchDown(event, x, y, pointer, button);
            }
        });

    }

}
