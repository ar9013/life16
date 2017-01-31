package com.ar9013.life16;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class Life16 extends ApplicationAdapter {


	Stage stage ;

	
	@Override
	public void create () {
		ScreenViewport viewport = new ScreenViewport();
		stage = new Stage(viewport);

		Gdx.input.setInputProcessor(stage);

		MyActor actor = new MyActor();
		stage.addActor(actor);
		stage.setKeyboardFocus(actor);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		stage.act(Gdx.graphics.getDeltaTime()); //  update
		stage.draw();
	}
	
	@Override
	public void dispose () {

	}
}
