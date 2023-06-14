package com.ravlal.ravlal_gameengine.engine.collision.hitbox;

import android.graphics.Bitmap;

import com.ravlal.ravlal_gameengine.util.bitmap.BitmapUtils;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class CircleHitBox extends BaseHitBox {

    private final Bitmap mHitBoxBitmap;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public CircleHitBox(int hitBoxRadius) {
        super(hitBoxRadius * 2, hitBoxRadius * 2);
        mHitBoxBitmap = BitmapUtils.createCircleBitmap(hitBoxRadius);
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public Bitmap getCollisionBitmap() {
        return mHitBoxBitmap;
    }
    //========================================================

}
