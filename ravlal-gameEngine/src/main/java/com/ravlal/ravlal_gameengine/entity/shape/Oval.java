package com.ravlal.ravlal_gameengine.entity.shape;

import android.graphics.Canvas;

import com.ravlal.ravlal_gameengine.engine.Engine;
import com.ravlal.ravlal_gameengine.engine.camera.Camera;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class Oval extends RectangleShape {

    protected int mRadiusX;
    protected int mRadiusY;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public Oval(Engine engine, int width, int height) {
        this(engine, 0, 0, width, height);
    }

    public Oval(Engine engine, float x, float y, int width, int height) {
        super(engine, x, y, width, height);
        mRadiusX = width / 2;
        mRadiusY = height / 2;
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public int getRadiusX() {
        return mRadiusX;
    }

    public void setRadiusX(int radiusX) {
        mRadiusX = radiusX;
    }

    public int getRadiusY() {
        return mRadiusY;
    }

    public void setRadiusY(int radiusY) {
        mRadiusY = radiusY;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void onDraw(Canvas canvas, Camera camera) {
        float screenLeft = camera.getWorldToScreenX(mX);
        float screenTop = camera.getWorldToScreenY(mY);
        float screenRight = camera.getWorldToScreenX(mX + mWidth);
        float screenBottom = camera.getWorldToScreenY(mY + mHeight);
        canvas.drawOval(screenLeft, screenTop, screenRight, screenBottom, mPaint);
    }
    //========================================================

}
