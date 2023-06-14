package com.ravlal.ravlal_gameengine.texture;

import android.graphics.Bitmap;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public interface Texture {

    TextureFormat getFormat();

    Bitmap getBitmap();

    int getWidth();

    int getHeight();

    void release();

}
