package com.ravlal.ravlal_gameengine.util.pool;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public interface Pool<T> {

    T obtainObject();

    void returnObject(T object);

    void release();

    public interface PoolObjectFactory<T> {

        T createObject();

    }

}
