package pl.taq.pierwsza.ui;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

/**
 * Created by root on 14.06.16.
 */
public class ScoreLabel extends Label{


    public ScoreLabel() {
        super("", prepareLabelStyle());
        init();
    }


    private void init(){
        this.setX(20);
        this.setY(650);
    }
    private static LabelStyle prepareLabelStyle(){
        LabelStyle labelStyle = new LabelStyle();
        labelStyle.font = new BitmapFont();
        return labelStyle;
    }
}
