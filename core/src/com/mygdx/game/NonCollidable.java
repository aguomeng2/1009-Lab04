package com.mygdx.game;

public class NonCollidable<T> extends Entity<T>{

    public NonCollidable(float x, float y, T object) {
        super(x, y, object);
    }

    @Override
    public void movement() {
        this.setPosition(this.getBrain().movement(this.getPosition()));
    }
}
