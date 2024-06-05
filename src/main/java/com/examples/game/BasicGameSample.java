package com.examples.game;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BasicGameSample extends GameApplication {

    @Override
    protected void initSettings(GameSettings gameSettings) {
            gameSettings.setWidth(800);
            gameSettings.setHeight(600);
            gameSettings.setTitle("BasicGameSimple");
    }

    @Override
    protected void initGame(){
        FXGL.entityBuilder()
                .at(500,150)
                .view(new Rectangle(40,40, Color.CHOCOLATE))
                .buildAndAttach();
    }

    public static void main (String[] args){
        launch(args);
    }
}
