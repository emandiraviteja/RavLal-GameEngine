package com.ravlal.ravlal_gameengine.engine.collision.hitbox;

import android.graphics.Bitmap;
import android.graphics.Rect;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public interface HitBox {

    Bitmap getCollisionBitmap();

    Rect getCollisionBounds();

    void setCollisionBoundsPosition(int x, int y);

}
