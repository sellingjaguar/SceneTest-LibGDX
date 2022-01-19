package com.testmenu.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.utils.ScreenUtils;

public class EndScreen extends ScreenAdapter {

    TestMenu game;

    public EndScreen(TestMenu game){
        this.game = game;
    }

    public void show(){

    }

    public void render(float delta){

        ScreenUtils.clear(0, 0, 0, 0);

        game.batch.begin();

        game.bitmapFont.getData().setScale(3.2f);
        game.bitmapFont.draw(game.batch, "THIS IS THE WIN SCREEN", Gdx.graphics.getWidth() * 0.05f, Gdx.graphics.getHeight() * 0.50f);

        game.bitmapFont.getData().setScale(1);
        game.bitmapFont.draw(game.batch, "cope 2.0", 10, 20);

        game.batch.end();

    }

}
