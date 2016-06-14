package pl.taq.pierwsza.graasdasd;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier;

import pl.taq.pierwsza.screen.SplashScreen;

public class asdasd extends Game {
	public final static String GAME_PREFS = "pl.taqie";
	public final static String GAME_PREFS_SCORE = "pl.taqie.score";
	public final static String GAME_NAME = "Pierwsza Gra";
	public final static int WIDTH = 480;
	public final static int HEIGHT = 700;


	private Preferences prefs;
	private int points;

	private boolean paused;
	@Override
	public void create () {
		init();
		this.setScreen(new SplashScreen(this));
	}
	private void init(){
		prefs = Gdx.app.getPreferences(GAME_PREFS);
		loadScore();
	}
	private void loadScore(){
		points = prefs.getInteger(GAME_PREFS_SCORE);
	}
	public  void addPoint(){
		points++;
		prefs.putInteger(GAME_PREFS_SCORE,points);
		prefs.flush();
	}
//setery i gettery
	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}

	public int getPoints() {
		return points;
	}


}
