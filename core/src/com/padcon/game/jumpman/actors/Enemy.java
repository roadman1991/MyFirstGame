package com.padcon.game.jumpman.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.padcon.game.jumpman.box2d.EnemyUserData;
import com.padcon.game.jumpman.box2d.UserData;

/**
 * Created by florian on 23.11.17.
 */

public class Enemy extends GameActor {

    public Enemy(Body body) {
        super(body);
    }

    @Override
    public EnemyUserData getUserData() {
        return (EnemyUserData) userData;
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        body.setLinearVelocity(getUserData().getLinearVelocity());
    }
}
