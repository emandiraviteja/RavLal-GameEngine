package com.ravlal.ravlal_gameengine.engine;

import android.graphics.Canvas;

import com.ravlal.ravlal_gameengine.engine.camera.Camera;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public interface Drawable {

    int getLayer();

    void setLayer(int layer);

    boolean isVisible();

    void setVisible(boolean visible);

    void draw(Canvas canvas, Camera camera);

    boolean isCulling(Camera camera);

}
