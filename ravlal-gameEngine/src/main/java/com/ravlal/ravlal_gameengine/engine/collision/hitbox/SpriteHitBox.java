package com.ravlal.ravlal_gameengine.engine.collision.hitbox;

import android.graphics.Bitmap;

import com.ravlal.ravlal_gameengine.util.bitmap.BitmapUtils;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class SpriteHitBox extends BaseHitBox {

    private final Bitmap mHitBoxBitmap;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public SpriteHitBox(Bitmap bitmap, int hitBoxWidth, int hitBoxHeight) {
        super(hitBoxWidth, hitBoxHeight);
        mHitBoxBitmap = BitmapUtils.createBitmap(bitmap, hitBoxWidth, hitBoxHeight);
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
