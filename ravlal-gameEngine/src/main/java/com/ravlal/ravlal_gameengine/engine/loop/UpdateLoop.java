package com.ravlal.ravlal_gameengine.engine.loop;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class UpdateLoop extends BaseLoop {

    private UpdateListener mListener;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public UpdateLoop() {
        super();
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public UpdateListener getListener() {
        return mListener;
    }

    public void setListener(UpdateListener listener) {
        mListener = listener;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void updateLoop(long elapsedMillis) {
        mListener.update(elapsedMillis);
    }
    //========================================================

    //--------------------------------------------------------
    // Inner Classes
    //--------------------------------------------------------
    public interface UpdateListener {

        void update(long elapsedMillis);

    }
    //========================================================

}
