package com.ravlal.ravlal_gameengine.input.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class AccelerationController extends BaseSensorController {

    private float mAccelX;
    private float mAccelY;
    private float mAccelZ;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public AccelerationController(Context context) {
        super(context);
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public float getAccelX() {
        return mAccelX;
    }

    public float getAccelY() {
        return mAccelY;
    }

    public float getAccelZ() {
        return mAccelZ;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void onSensorChanged(SensorEvent event) {
        mAccelX = event.values[0];
        mAccelY = event.values[1];
        mAccelZ = event.values[2];
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override
    protected void registerListener() {
        mSensorManager.registerListener(this,
                mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_GAME);
    }

    @Override
    protected void unregisterListener() {
        mSensorManager.unregisterListener(this);
    }
    //========================================================

}
