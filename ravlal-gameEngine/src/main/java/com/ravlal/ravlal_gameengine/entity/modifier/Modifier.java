package com.ravlal.ravlal_gameengine.entity.modifier;

import com.ravlal.ravlal_gameengine.entity.Entity;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public interface Modifier<T extends Entity> {

    ModifierListener getListener();

    void setListener(ModifierListener listener);

    long getDuration();

    void setDuration(long duration);

    long getStartDelay();

    void setStartDelay(long startDelay);

    long getElapsedDuration();

    boolean isRunning();

    void setRunning(boolean running);

    boolean isLooping();

    void setLooping(boolean looping);

    boolean isAutoRemove();

    void setAutoRemove(boolean autoRemove);

    void init(T entity);

    void update(T entity, long elapsedMillis);

    void reset(T entity);

    public interface ModifierListener {

        void onModifierComplete();

    }

}
