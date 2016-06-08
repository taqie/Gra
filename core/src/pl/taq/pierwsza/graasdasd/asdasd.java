package pl.taq.pierwsza.graasdasd;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier;

public class asdasd extends Game {
	SpriteBatch batch;
	Texture img;
	public final static String GAME_NAME = "Pierwsza Gra";
	public final static int WIDTH = 480;
	public final static int HEIGHT = 700;



	private boolean paused;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("F:\\AndroidStudioProjects\\asdasd\\desktop\\src\\pl\\taq\\pierwsza\\graasdasd\\desktop\\badlogic.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
//setery i gettery
	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}
}
