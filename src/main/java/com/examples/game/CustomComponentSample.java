package com.examples.game;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import javafx.scene.shape.Rectangle;
import com.almasb.fxgl.entity.component.Component;

import java.awt.*;

public class CustomComponentSample extends GameApplication {



    @Override
    protected void initSettings(GameSettings gameSettings) {}

    @Override
    protected void initGame(){
        FXGL.entityBuilder()
                .at(400,300)
                .view(new Rectangle(40,40))
                .with(new RotatingComponent())
                .buildAndAttach();
    }

    private static class RotatingComponent extends Component{
        @Override
        public void onUpdate(double tpf){
            entity.rotateBy(tpf * 3000);
        }
    }

    public static void main (String[] args){
        launch(args);
    }
}
