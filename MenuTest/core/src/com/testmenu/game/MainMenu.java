package com.testmenu.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainMenu extends ScreenAdapter {

    TestMenu game;

    public MainMenu(TestMenu game){

        this.game = game;

    }

    public void show(){

        Gdx.input.setInputProcessor(new InputAdapter(){

            public boolean keyDown(int keyCode){

                game.setScreen(new GameScreen(game));

                return true;
            }

        });

    }

    public void render(float delta){

        ScreenUtils.clear(0, 0, 0, 0);

        game.batch.begin();

        game.bitmapFont.setColor(Color.GREEN);

        game.bitmapFont.draw(game.batch, "Main Menu Screen", Gdx.graphics.getWidth() * 0.25f, Gdx.graphics.getHeight() * 0.66f);
        game.bitmapFont.draw(game.batch, "Press ANY KEY to start", Gdx.graphics.getWidth() * 0.25f, Gdx.graphics.getHeight() * 0.33f);

        game.batch.end();

    }

}
