package com.ravlal.ravlal_gameengine.entity.primitive;

import android.graphics.Canvas;
import android.graphics.PorterDuff;

import com.ravlal.ravlal_gameengine.engine.Engine;
import com.ravlal.ravlal_gameengine.engine.camera.Camera;
import com.ravlal.ravlal_gameengine.entity.ScreenEntity;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class Color extends ScreenEntity {

    protected int mColor;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public Color(Engine engine, int color) {
        super(engine, 0, 0);
        mColor = color;
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public int getColor() {
        return mColor;
    }

    public void setColor(int color) {
        mColor = color;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void onDraw(Canvas canvas, Camera camera) {
        canvas.drawColor(mColor, PorterDuff.Mode.SRC_ATOP);
    }

    @Override
    public boolean isCulling(Camera camera) {
        // Color Bg is always on screen
        return false;
    }
    //========================================================

}
