package com.testmenu.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class TestMenu extends Game {

	protected SpriteBatch batch;
	protected ShapeRenderer shapeRenderer;
	protected BitmapFont bitmapFont;

	public void create () {

		batch = new SpriteBatch();
		shapeRenderer = new ShapeRenderer();
		bitmapFont = new BitmapFont();

		setScreen(new MainMenu(this));

	}

	public void dispose () {
		batch.dispose();
		shapeRenderer.dispose();
		bitmapFont.dispose();
	}
}
