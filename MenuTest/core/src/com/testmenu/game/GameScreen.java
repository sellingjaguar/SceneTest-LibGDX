package com.testmenu.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.Random;

public class GameScreen extends ScreenAdapter {

    TestMenu game;

    float x, y;
    int dirX, dirY;
    int speed = 600;

    public GameScreen(TestMenu game){
        this.game = game;
    }

    public void show(){
        x = Gdx.graphics.getWidth()/2;
        y = Gdx.graphics.getHeight()/2;

        Random random = new Random();

        dirX = random.nextInt(2);
        if (dirX == 0) dirX = -1;

        dirY = random.nextInt(2);
        if (dirY == 0) dirY = -1;
    }

    public void render(float delta){

        boolean xSwap = false;
        boolean ySwap = false;

        if (x <= 0 && dirX == -1){
            dirX = 1;
            xSwap = true;
        }
        else if (x + 50 > Gdx.graphics.getWidth() && dirX == 1){
            dirX = -1;
            xSwap = true;
        }

        if (y <= 0 && dirY == -1){
            dirY = 1;
            ySwap = true;
        }
        else if (y + 20 > Gdx.graphics.getHeight() && dirY == 1){
            dirY = -1;
            ySwap = true;
        }

        if (xSwap && ySwap){
            game.setScreen(new EndScreen(game));
        }

        x += speed * Gdx.graphics.getDeltaTime() * dirX;
        y += speed * Gdx.graphics.getDeltaTime() * dirY;

        ScreenUtils.clear(0, 0, 0, 0);

        game.shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        game.shapeRenderer.rect(x, y, 50, 20);

        game.shapeRenderer.end();

        game.batch.begin();

        game.bitmapFont.getData().setScale(4);
        game.bitmapFont.draw(game.batch, "THIS IS THE GAME", Gdx.graphics.getWidth() * 0.10f, Gdx.graphics.getHeight() * 0.50f);

        game.bitmapFont.getData().setScale(1);
        game.bitmapFont.draw(game.batch, "cope", 10, 20);

        game.batch.end();

    }

}
