package com.ravlal.ravlal_gameengine.engine.collision.algorithm;

import com.ravlal.ravlal_gameengine.engine.collision.Collidable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class Collision {

    private static final List<Collision> COLLISION_POOL = new ArrayList<>();

    private Collidable mCollidableA;
    private Collidable mCollidableB;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    private Collision(Collidable collidableA, Collidable collidableB) {
        mCollidableA = collidableA;
        mCollidableB = collidableB;
    }
    //========================================================

    //--------------------------------------------------------
    // Static methods
    //--------------------------------------------------------
    public static Collision initCollision(Collidable collidableA, Collidable collidableB) {
        if (COLLISION_POOL.isEmpty()) {
            return new Collision(collidableA, collidableB);
        }
        Collision c = COLLISION_POOL.remove(0);
        c.mCollidableA = collidableA;
        c.mCollidableB = collidableB;
        return c;
    }

    public static void returnCollision(Collision collision) {
        collision.mCollidableA = null;
        collision.mCollidableB = null;
        COLLISION_POOL.add(collision);
    }
    //========================================================

    //--------------------------------------------------------
    // Methods
    //--------------------------------------------------------
    public boolean equals(Collision collision) {
        return (mCollidableA == collision.mCollidableA && mCollidableB == collision.mCollidableB)
                || (mCollidableA == collision.mCollidableB && mCollidableB == collision.mCollidableA);
    }
    //========================================================

}
