package com.ravlal.ravlal_gameengine.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class GameView extends View {

    private OnDrawListener mListener;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public GameView(Context context) {
        super(context);
        // To create view from Java
    }

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // To create view from xml
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public OnDrawListener getListener() {
        return mListener;
    }

    public void setListener(OnDrawListener listener) {
        mListener = listener;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mListener.onDraw(canvas);
    }
    //========================================================

    //--------------------------------------------------------
    // Methods
    //--------------------------------------------------------
    public void draw() {
        postInvalidate();
    }
    //========================================================

    //--------------------------------------------------------
    // Inner Classes
    //--------------------------------------------------------
    public interface OnDrawListener {

        void onDraw(Canvas canvas);

    }
    //========================================================

}
