package pl.taq.pierwsza.graasdasd.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import pl.taq.pierwsza.graasdasd.asdasd;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = asdasd.GAME_NAME;
		config.width = asdasd.WIDTH;
		config.height = asdasd.HEIGHT;
		config.resizable = false;
		new LwjglApplication(new asdasd(), config);
	}
}
