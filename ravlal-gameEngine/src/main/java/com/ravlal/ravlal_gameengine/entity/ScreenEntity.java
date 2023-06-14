package com.ravlal.ravlal_gameengine.entity;

import android.graphics.Canvas;

import com.ravlal.ravlal_gameengine.engine.Drawable;
import com.ravlal.ravlal_gameengine.engine.Engine;
import com.ravlal.ravlal_gameengine.engine.camera.Camera;
import com.ravlal.ravlal_gameengine.engine.camera.CameraListener;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public abstract class ScreenEntity extends Entity implements Drawable, CameraListener {

    protected final float mPixelFactor;

    protected float mX;
    protected float mY;
    protected int mLayer;
    private boolean mIsVisible = true;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    protected ScreenEntity(Engine engine, float x, float y) {
        super(engine);
        mPixelFactor = engine.getCamera().getPixelFactor();
        mX = x;
        mY = y;
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public float getX() {
        return mX;
    }

    public void setX(float x) {
        mX = x;
    }

    public float getY() {
        return mY;
    }

    public void setY(float y) {
        mY = y;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public int getLayer() {
        return mLayer;
    }

    @Override
    public void setLayer(int layer) {
        mLayer = layer;
    }

    @Override
    public boolean isVisible() {
        return mIsVisible;
    }

    @Override
    public void setVisible(boolean visible) {
        mIsVisible = visible;
    }

    @Override
    public void draw(Canvas canvas, Camera camera) {
        onPreDraw(canvas, camera);
        onDraw(canvas, camera);
        onPostDraw(canvas, camera);
    }

    @Override
    public void reset() {
        super.reset();
        mIsVisible = true;
    }

    @Override
    public void setCameraOffset(float offsetX, float offsetY) {
        mX += offsetX;
        mY += offsetY;
    }
    //========================================================

    //--------------------------------------------------------
    // Methods
    //--------------------------------------------------------
    public void onPreDraw(Canvas canvas, Camera camera) {
    }

    public abstract void onDraw(Canvas canvas, Camera camera);

    public void onPostDraw(Canvas canvas, Camera camera) {
    }
    //========================================================

}
