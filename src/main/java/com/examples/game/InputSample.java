package com.examples.game;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.input.Input;
import com.almasb.fxgl.input.UserAction;
import javafx.scene.input.KeyCode;

public class InputSample extends GameApplication {



    @Override
    protected void initSettings(GameSettings gameSettings) {}


    protected void initInput(){
        Input input = FXGL.getInput();

        input.addAction(new UserAction("Print Line RIGHT") {
            @Override
            protected void onActionBegin(){
                System.out.println("Action Begin RIGHT");
            }
            @Override
            protected void onAction(){
                System.out.println("On Action RIGHT");
            }

            @Override
            protected void onActionEnd(){
                System.out.println("Action end RIGHT");
            }
        },KeyCode.RIGHT);
        input.addAction(new UserAction("Print Line RLEFT") {
            @Override
            protected void onActionBegin(){
                System.out.println("Action Begin LEFT");
            }
            @Override
            protected void onAction(){
                System.out.println("On Action LEFT");
            }

            @Override
            protected void onActionEnd(){
                System.out.println("Action end LEFT");
            }
        },KeyCode.LEFT);
    }


    public static void main (String[] args){
        launch(args);
    }
}
