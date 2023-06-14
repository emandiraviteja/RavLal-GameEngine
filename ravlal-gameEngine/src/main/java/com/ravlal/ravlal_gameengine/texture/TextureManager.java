package com.ravlal.ravlal_gameengine.texture;

import android.graphics.Bitmap;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public interface TextureManager<T extends Texture, S extends TextureGroup<T>> {

    T loadTexture(int drawableId);

    T loadTexture(Bitmap bitmap);

    S loadTextureGroup(int[] drawableIds);

    S loadTextureGroup(Bitmap[] bitmaps);

    void release();

    void addTexture(T graphic);

    void removeTexture(T graphic);

}
