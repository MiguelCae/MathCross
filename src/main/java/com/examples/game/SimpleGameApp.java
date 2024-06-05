package com.examples.game;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.core.math.FXGLMath;
import javafx.geometry.Rectangle2D;
import javafx.util.Duration;

import static com.almasb.fxgl.dsl.FXGLForKtKt.*;

public class SimpleGameApp extends GameApplication {
    @Override
    protected void initSettings(GameSettings gameSettings) {

    }
    @Override
    protected void initGame() {
        getGameWorld().addEntityFactory(new SimpleFactory());

        run(() -> {
            spawn("ally", FXGLMath.randomPoint(
                    new Rectangle2D(0, 0, getAppWidth(), getAppHeight()))
            );

            spawn("enemy", FXGLMath.randomPoint(
                    new Rectangle2D(0, 0, getAppWidth(), getAppHeight()))
            );
            return null;
        }, Duration.seconds(1));
    }

    public static void main(String[] args){
        launch(args);
    }
}
