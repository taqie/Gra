package pl.taq.pierwsza.ui;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

/**
 * Created by root on 14.06.16.
 */
public class ClicerGameButton extends Button {
    public ClicerGameButton(final ClickCallBack clickCallBack) {
        super(new ButtonStyle());
        init(clickCallBack);
    }

    private void init(final ClickCallBack clickCallBack){
        this.setY(450);
        this.setX(100);
        this.setWidth(300);
        this.setHeight(70);
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
