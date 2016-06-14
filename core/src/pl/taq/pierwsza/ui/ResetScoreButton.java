package pl.taq.pierwsza.ui;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

/**
 * Created by root on 14.06.16.
 */
public class ResetScoreButton extends Button {

    public ResetScoreButton(final ClickCallBack clickCallBack) {
        super(new ButtonStyle());
        init(clickCallBack);
    }

    private void init(final ClickCallBack clickCallBack){
        this.setX(330);
        this.setY(560);
        this.setWidth(100);
        this.setHeight(100);
        this.setDebug(true);

        this.addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                clickCallBack.onclick();
                return super.touchDown(event, x, y, pointer, button);
            }
        });
    }
}
