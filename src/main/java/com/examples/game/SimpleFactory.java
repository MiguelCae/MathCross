package com.examples.game;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.dsl.components.ProjectileComponent;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.Spawns;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;


public class SimpleFactory  implements EntityFactory {

    @Spawns("enemy")
    public Entity newEnemy(SpawnData data){
        return FXGL.entityBuilder(data)

                .view("texturebrick.png")
                .with(new ProjectileComponent(new Point2D(2,0),500))
                .build();
    }

    @Spawns("ally")
    public Entity newAlly(SpawnData data){
        var texture = FXGL.texture("texturebrick.png").multiplyColor(Color.GREEN);
        return FXGL.entityBuilder(data)
                //.view(new Rectangle(40,40, Paint.valueOf("red")))
                .view(texture)
                .with(new ProjectileComponent(new Point2D(-1,0),150))
                .build();
    }
}
