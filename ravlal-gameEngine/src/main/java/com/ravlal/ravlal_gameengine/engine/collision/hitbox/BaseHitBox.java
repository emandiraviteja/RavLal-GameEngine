package com.ravlal.ravlal_gameengine.engine.collision.hitbox;

import android.graphics.Rect;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public abstract class BaseHitBox implements HitBox {

    private final int mHitBoxWidth;
    private final int mHitBoxHeight;

    private final Rect mBounds = new Rect(-1, -1, -1, -1);

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    protected BaseHitBox(int hitBoxWidth, int hitBoxHeight) {
        mHitBoxWidth = hitBoxWidth;
        mHitBoxHeight = hitBoxHeight;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public Rect getCollisionBounds() {
        return mBounds;
    }

    @Override
    public void setCollisionBoundsPosition(int x, int y) {
        // Align to center
        mBounds.set(x - mHitBoxWidth / 2,
                y - mHitBoxHeight / 2,
                x + mHitBoxWidth / 2,
                y + mHitBoxHeight / 2);
    }
    //========================================================

}
