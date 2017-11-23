package com.padcon.game.jumpman.box2d;

import com.padcon.game.jumpman.enums.UserDataType;

/**
 * Created by florian on 23.11.17.
 */

public abstract class UserData {
    protected UserDataType userDataType;

    protected float width;
    protected float height;

    public UserData() {

    }

    public UserData(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public UserDataType getUserDataType() {
        return userDataType;
    }
}
