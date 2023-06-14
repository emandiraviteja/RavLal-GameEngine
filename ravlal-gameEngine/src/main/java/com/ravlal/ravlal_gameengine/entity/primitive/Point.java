package com.ravlal.ravlal_gameengine.entity.primitive;

import android.graphics.Canvas;

import com.ravlal.ravlal_gameengine.engine.Engine;
import com.ravlal.ravlal_gameengine.engine.camera.Camera;
import com.ravlal.ravlal_gameengine.entity.shape.Shape;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class Point extends Shape {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public Point(Engine engine, float x, float y) {
        super(engine, x, y);
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void onDraw(Canvas canvas, Camera camera) {
        float screenX = camera.getWorldToScreenX(mX);
        float screenY = camera.getWorldToScreenY(mY);
        canvas.drawPoint(screenX, screenY, mPaint);
    }

    @Override
    public boolean isCulling(Camera camera) {
        return camera.getWorldToScreenX(mX) > camera.getScreenWidth()
                || camera.getWorldToScreenY(mY) > camera.getScreenHeight()
                || camera.getWorldToScreenX(mX) < 0
                || camera.getWorldToScreenY(mY) < 0;
    }
    //========================================================

}
