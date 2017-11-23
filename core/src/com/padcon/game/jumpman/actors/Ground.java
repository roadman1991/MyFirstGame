package com.padcon.game.jumpman.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.padcon.game.jumpman.box2d.GroundUserData;

/**
 * Created by florian on 23.11.17.
 */

public class Ground extends GameActor {

    public Ground(Body body){
        super(body);
    }

    @Override
    public GroundUserData getUserData() {
        return (GroundUserData) userData;
    }
}
