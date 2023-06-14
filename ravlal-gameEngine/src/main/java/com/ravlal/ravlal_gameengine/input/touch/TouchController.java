package com.ravlal.ravlal_gameengine.input.touch;

import android.view.View;
import com.ravlal.ravlal_gameengine.input.InputController;
import java.util.List;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public interface TouchController extends InputController, View.OnTouchListener {

    float getTouchX();

    float getTouchY();

    boolean isTouchDown();

    List<TouchEvent> getTouchEvents();

}
